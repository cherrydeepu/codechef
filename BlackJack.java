import java.util.Scanner;
class Blackjack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = 21 - (A + B);
            if (C >= 1 && C <= 10) {
                System.out.println(C);
            } else {
                System.out.println(-1);
            }
        }

        scanner.close();
    }
}
