import java.util.Scanner;
class DetermineWinner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 
        for (int t = 0; t < T; t++) {
            int PA = scanner.nextInt();
            int PB = scanner.nextInt();
            int QA = scanner.nextInt();
            int QB = scanner.nextInt();
            int penaltyP = Math.max(PA, PB);
            int penaltyQ = Math.max(QA, QB);
            if (penaltyP < penaltyQ) {
                System.out.println("P");
            } else if (penaltyQ < penaltyP) {
                System.out.println("Q");
            } else {
                System.out.println("TIE");
            }
        }

        scanner.close();
    }
}
