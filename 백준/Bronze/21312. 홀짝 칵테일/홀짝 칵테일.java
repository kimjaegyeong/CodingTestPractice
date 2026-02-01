import java.io.*;
import java.util.*;

public class Main {
    static boolean better(int x, int y) {
        boolean ox = (x & 1) != 0;
        boolean oy = (y & 1) != 0;

        if (ox != oy) return ox;   // 홀수면 무조건 더 좋음
        return x > y;              // 같은 홀짝이면 더 큰 값
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[] vals = {A, B, C};
        int best = Integer.MIN_VALUE;

        for (int mask = 1; mask < 8; mask++) {   // 1..7
            int prod = 1;
            for (int i = 0; i < 3; i++) {
                if ((mask & (1 << i)) != 0) prod *= vals[i];
            }
            if (better(prod, best)) best = prod;
        }

        System.out.println(best);
    }
}
