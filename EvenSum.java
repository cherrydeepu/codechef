import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int sum = 0;

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                sum += A[i];
            }

            boolean possible = false;

            for (int i = 0; i < N; i++) {
                if ((sum - A[i]) % 2 == 0) {
                    possible = true;
                    break;
                }
            }

            System.out.println(possible ? "Yes" : "No");
        }

        sc.close();
    }
}