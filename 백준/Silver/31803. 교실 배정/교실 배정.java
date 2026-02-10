import java.util.*;
import java.math.*;

public class Main {

    static BigInteger factorial(int n) {
        BigInteger res = BigInteger.ONE;
        for(int i=2;i<=n;i++){
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int k = N/2; // floor(N/2)

        // N! / (2^k * k! * (N-2k)!)
        BigInteger numerator = factorial(N);
        BigInteger denominator = BigInteger.valueOf(2).pow(k)
                .multiply(factorial(k))
                .multiply(factorial(N - 2*k));

        System.out.println(numerator.divide(denominator));
    }
}
