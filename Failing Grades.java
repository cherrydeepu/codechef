import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int sum = 0;
            boolean ok = true;

            for (int i = 1; i <= N; i++) {
                int marks = sc.nextInt();
                sum += marks;

                if ((double) sum / i < 40) {
                    ok = false;
                }
            }

            if (ok)
                System.out.println("Yes");
            else
                System.out.println("No");
        }

        sc.close();
    }
}