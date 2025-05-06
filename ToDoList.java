import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // Number of test cases
        
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();  // Number of problems
            int count = 0;         // Count of problems to remove
            
            for (int i = 0; i < N; i++) {
                int difficulty = sc.nextInt();
                if (difficulty >= 1000) {
                    count++;
                }
            }
            
            System.out.println(count);
        }

        sc.close();
    }
}
