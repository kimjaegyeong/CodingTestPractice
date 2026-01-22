import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        int side = (1 << n) + 1;      // 2^n + 1
        int result = side * side;     // (2^n + 1)^2

        System.out.println(result);
    }
}
