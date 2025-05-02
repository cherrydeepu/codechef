import java.util.*;
class CricketMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt(); // Runs required
            int M = sc.nextInt(); // Overs remaining

            int maxRunsPossible = M * 6 * 6; // 6 balls per over, 6 runs per ball

            if (N <= maxRunsPossible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
