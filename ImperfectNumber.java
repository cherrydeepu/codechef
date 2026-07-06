import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int ans = Integer.MAX_VALUE;

            for (int i = 1; i <= 200; i++) {
                boolean imperfect = ((i % 2 == 0) && (i % 5 != 0)) ||
                                    ((i % 5 == 0) && (i % 2 != 0));

                if (imperfect) {
                    ans = Math.min(ans, Math.abs(N - i));
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}