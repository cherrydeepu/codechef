import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();

            int profit = 0;

            for (int i = 1; i <= N; i++) {
                if (i > X) {
                    profit += (i - X);
                }
            }

            System.out.println(profit);
        }
    }
}