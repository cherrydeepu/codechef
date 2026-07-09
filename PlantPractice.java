import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int ans = 0;

            for (int i = 0; i < N - 1; i++) {
                ans = Math.max(ans, Math.min(A[i], A[i + 1]));
            }

            System.out.println(ans);
        }

        sc.close();
    }
}