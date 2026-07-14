class Solution {

    // 0: 오른쪽, 1: 왼쪽, 2: 위, 3: 아래
    private static final int[] DY = {0, 0, -1, 1};
    private static final int[] DX = {1, -1, 0, 0};

    /*
     * 현재 방향으로 다음 칸에 진입했을 때
     * 놓을 수 있는 선로 번호
     */
    private static final int[][] CANDIDATES = {
        {1, 3, 4, 7}, // 오른쪽 이동: 왼쪽에서 진입
        {1, 3, 5, 6}, // 왼쪽 이동: 오른쪽에서 진입
        {2, 3, 6, 7}, // 위쪽 이동: 아래에서 진입
        {2, 3, 4, 5}  // 아래 이동: 위에서 진입
    };

    private int n;
    private int m;
    private int answer;

    private int[][] grid;

    /*
     * 현재 배치된 선로
     *
     * 0: 선로 없음
     * 1~7: 선로 번호
     */
    private int[][] rail;

    /*
     * 해당 칸의 선로를 지나간 축
     *
     * 0: 방문하지 않음
     * 1: 가로 방향 방문
     * 2: 세로 방향 방문
     * 3: 가로와 세로 모두 방문
     */
    private int[][] usedAxis;

    public int solution(int[][] grid) {
        this.grid = grid;
        this.n = grid.length;
        this.m = grid[0].length;
        this.answer = 0;

        rail = new int[n][m];
        usedAxis = new int[n][m];

        /*
         * 처음부터 배치되어 있는 선로를 모두 복사한다.
         * 기존 코드에서는 시작 선로만 복사해서
         * 방문하지 않은 고정 선로를 검사하지 못했다.
         */
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < m; x++) {
                if (grid[y][x] > 0) {
                    rail[y][x] = grid[y][x];
                }
            }
        }

        /*
         * 기차는 (0, 0)의 1번 선로에서
         * 오른쪽으로 출발한다.
         */
        usedAxis[0][0] = 1;

        dfs(0, 0, 0);

        return answer;
    }

    /*
     * 현재 (y, x) 선로를 통과했고,
     * dir 방향으로 다음 칸을 향하는 상태
     */
    private void dfs(int y, int x, int dir) {
        int ny = y + DY[dir];
        int nx = x + DX[dir];

        if (!isInside(ny, nx)) {
            return;
        }

        if (grid[ny][nx] == -1) {
            return;
        }

        /*
         * 다음 칸에 이미 선로가 있으면
         * 해당 선로로만 이동한다.
         */
        if (rail[ny][nx] != 0) {
            move(
                ny,
                nx,
                dir,
                rail[ny][nx],
                false
            );

            return;
        }

        /*
         * 빈칸이면 현재 진입 방향과 연결 가능한
         * 선로를 하나씩 배치한다.
         */
        for (int railNum : CANDIDATES[dir]) {
            move(
                ny,
                nx,
                dir,
                railNum,
                true
            );
        }
    }

    private void move(
        int y,
        int x,
        int inDir,
        int railNum,
        boolean newlyPlaced
    ) {
        int outDir = nextDirection(inDir, railNum);

        /*
         * 현재 방향으로 해당 선로에
         * 진입할 수 없는 경우
         */
        if (outDir == -1) {
            return;
        }

        int axis = axisOf(inDir);

        if (railNum == 3) {
            /*
             * 3번 선로는 가로와 세로를
             * 각각 한 번씩 지날 수 있다.
             *
             * 같은 축으로 두 번 지나는 것은 금지한다.
             */
            if ((usedAxis[y][x] & axis) != 0) {
                return;
            }
        } else {
            /*
             * 일반 선로는 한 번만 지날 수 있다.
             *
             * 다시 방문하면 선로를 따라 순환하면서
             * 목적지에 도달할 수 없다.
             */
            if (usedAxis[y][x] != 0) {
                return;
            }
        }

        if (newlyPlaced) {
            rail[y][x] = railNum;
        }

        usedAxis[y][x] |= axis;

        /*
         * 목적지 선로에 진입했다면
         * 전체 선로가 사용됐는지 확인한다.
         */
        if (y == n - 1 && x == m - 1) {
            if (allRailsVisited()) {
                answer++;
            }
        } else {
            dfs(y, x, outDir);
        }

        // 백트래킹
        usedAxis[y][x] ^= axis;

        if (newlyPlaced) {
            rail[y][x] = 0;
        }
    }

    /*
     * 현재 이동 방향으로 선로에 진입했을 때
     * 선로를 빠져나가는 방향을 반환한다.
     */
    private int nextDirection(int dir, int railNum) {
        switch (railNum) {
            case 1:
                // 가로 선로
                if (dir == 0 || dir == 1) {
                    return dir;
                }
                return -1;

            case 2:
                // 세로 선로
                if (dir == 2 || dir == 3) {
                    return dir;
                }
                return -1;

            case 3:
                // 교차 선로는 직진
                return dir;

            case 4:
                // 왼쪽 ↔ 위
                if (dir == 0) return 2; // 오른쪽 이동 → 위
                if (dir == 3) return 1; // 아래 이동 → 왼쪽
                return -1;

            case 5:
                // 오른쪽 ↔ 위
                if (dir == 1) return 2; // 왼쪽 이동 → 위
                if (dir == 3) return 0; // 아래 이동 → 오른쪽
                return -1;

            case 6:
                // 오른쪽 ↔ 아래
                if (dir == 1) return 3; // 왼쪽 이동 → 아래
                if (dir == 2) return 0; // 위 이동 → 오른쪽
                return -1;

            case 7:
                // 왼쪽 ↔ 아래
                if (dir == 0) return 3; // 오른쪽 이동 → 아래
                if (dir == 2) return 1; // 위 이동 → 왼쪽
                return -1;

            default:
                return -1;
        }
    }

    /*
     * 배치된 모든 선로가 사용됐는지 검사한다.
     */
    private boolean allRailsVisited() {
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < m; x++) {
                if (rail[y][x] == 0) {
                    continue;
                }

                if (rail[y][x] == 3) {
                    /*
                     * 3번 선로는 가로와 세로 방향을
                     * 모두 지나야 한다.
                     */
                    if (usedAxis[y][x] != 3) {
                        return false;
                    }
                } else {
                    /*
                     * 나머지 선로는 한 번 이상
                     * 사용되어야 한다.
                     */
                    if (usedAxis[y][x] == 0) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    private int axisOf(int dir) {
        if (dir == 0 || dir == 1) {
            return 1;
        }

        return 2;
    }

    private boolean isInside(int y, int x) {
        return y >= 0 && y < n
            && x >= 0 && x < m;
    }
}