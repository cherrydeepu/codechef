import java.util.Scanner;
class CricketTournament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt(); 
            int M = sc.nextInt(); 
            if (M <= N - 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
