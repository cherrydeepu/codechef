import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            boolean[] suffixEven = new boolean[N];
            int parity = 0;

            // suffix parity (0 = even, 1 = odd)
            for (int i = N - 1; i >= 0; i--) {
                parity ^= (A[i] % 2);
                suffixEven[i] = (parity == 0);
            }

            boolean prefixEven = true;
            boolean possible = false;

            for (int i = 0; i < N; i++) {
                if (prefixEven && suffixEven[i]) {
                    possible = true;
                    break;
                }
                if (A[i] % 2 != 0) {
                    prefixEven = false;
                }
            }

            System.out.println(possible ? "Yes" : "No");
        }
    }
}