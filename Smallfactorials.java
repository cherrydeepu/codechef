import java.util.*;
import java.math.BigInteger;

class Smallfactorials {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();  

        while (t-- > 0) {
            int n = s.nextInt();
            System.out.println(factorial(n));
        }
    }
    static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
