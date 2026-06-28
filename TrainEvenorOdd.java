import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();

            int oddSum = 0;
            int evenSum = 0;

            for (int i = 1; i <= N; i++) {
                int hours = sc.nextInt();

                if (i % 2 == 1) {
                    oddSum += hours;
                } else {
                    evenSum += hours;
                }
            }

            System.out.println(Math.max(oddSum, evenSum));
        }

        sc.close();
    }
}