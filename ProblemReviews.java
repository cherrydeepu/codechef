import java.util.Scanner;
class ProblemReviews {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();  
            boolean isGood = true;
            
            for (int i = 0; i < N; i++) {
                int score = scanner.nextInt();
                if (score <= 4) {
                    isGood = false;
                }
            }
            
            System.out.println(isGood ? "YES" : "NO");
        }
        
        scanner.close();
    }
}

