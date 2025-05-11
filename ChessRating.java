import java.util.Scanner;
class ChessRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int X = sc.nextInt(); 
            int Y = sc.nextInt();
            int games = Math.max(0, (Y - X + 7) / 8);
            
            System.out.println(games);
        }

        sc.close();
    }
}

