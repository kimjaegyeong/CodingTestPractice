import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int target = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][N];

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        int x = N / 2;
        int y = N / 2;

        arr[x][y] = 1;

        int num = 2;
        int len = 1; 

        int ansX = x;
        int ansY = y;

        if (target == 1) {
            ansX = x;
            ansY = y;
        }

        while (num <= N * N) {
            for (int d = 0; d < 4; d++) {

                for (int i = 0; i < len; i++) {
                    if (num > N * N) break;

                    x += dx[d];
                    y += dy[d];

                    arr[x][y] = num;

                    if (num == target) {
                        ansX = x;
                        ansY = y;
                    }

                    num++;
                }


                if (d % 2 == 1) len++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }

        // 좌표는 1-based
        sb.append((ansX + 1) + " " + (ansY + 1));

        System.out.println(sb);
    }
}