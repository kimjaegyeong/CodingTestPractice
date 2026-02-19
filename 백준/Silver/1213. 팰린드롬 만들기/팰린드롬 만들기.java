import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int[] cnt = new int[26];

        // 알파벳 개수 세기
        for (char c : input.toCharArray()) {
            cnt[c - 'A']++;
        }

        // 홀수 체크
        int odd = 0;
        char mid = 0;

        for (int i = 0; i < 26; i++) {
            if (cnt[i] % 2 == 1) {
                odd++;
                mid = (char)(i + 'A');
            }
        }

        if (odd > 1) {
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        StringBuilder left = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < cnt[i] / 2; j++) {
                left.append((char)(i + 'A'));
            }
        }

        StringBuilder right = new StringBuilder(left).reverse();

        if (odd == 1) {
            System.out.println(left.toString() + mid + right.toString());
        } else {
            System.out.println(left.toString() + right.toString());
        }
    }
}
