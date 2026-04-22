import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] map;
    static boolean[] d1, d2;
    static int blackMax = 0, whiteMax = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        d1 = new boolean[2 * N];
        d2 = new boolean[2 * N];

        dfs(0, 0, 0);
        dfs(0, 1, 0);

        System.out.println(blackMax + whiteMax);
    }

    static void dfs(int idx, int color, int cnt) {
        if (idx >= N * N) {
            if (color == 0) blackMax = Math.max(blackMax, cnt);
            else whiteMax = Math.max(whiteMax, cnt);
            return;
        }

        int y = idx / N;
        int x = idx % N;

        if ((y + x) % 2 == color && map[y][x] == 1) {
            int a = y + x;
            int b = y - x + N - 1;

            if (!d1[a] && !d2[b]) {
                d1[a] = d2[b] = true;
                dfs(idx + 1, color, cnt + 1);
                d1[a] = d2[b] = false;
            }
        }

        dfs(idx + 1, color, cnt);
    }
}
