import java.util.Scanner;
class ChessWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int minMatches = (B - A) + 1;
        System.out.println(minMatches);
    }
}
