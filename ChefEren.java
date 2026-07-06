import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();

            int even = N / 2;
            int odd = (N + 1) / 2;

            System.out.println(even * A + odd * B);
        }

        sc.close();
    }
}