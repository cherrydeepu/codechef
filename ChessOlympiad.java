import java.util.Scanner;
class ChessOlympiad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt(); 
        int Z = scanner.nextInt(); 
        double yourScore = X * 1.0 + Y * 0.5;
        double opponentScore = Z * 1.0 + Y * 0.5;
        int remainingGames = 4 - (X + Y + Z);
        double maxFinalScore = yourScore + remainingGames * 1.0;
        if (maxFinalScore > opponentScore) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
