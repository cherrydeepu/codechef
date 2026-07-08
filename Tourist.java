import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();

            int minDist = Integer.MAX_VALUE;

            for (int i = 0; i < N; i++) {
                int X = sc.nextInt();
                int Y = sc.nextInt();

                int dist = Math.abs(A - X) + Math.abs(B - Y);
                minDist = Math.min(minDist, dist);
            }

            System.out.println(minDist);
        }

        sc.close();
    }
}