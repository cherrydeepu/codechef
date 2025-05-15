import java.util.Scanner;
class BestMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            
            int minCost = Integer.MAX_VALUE;
            boolean found = false;
            
            for (int i = 0; i < N; i++) {
                int rating = scanner.nextInt();
                int cost = scanner.nextInt();
                
                if (rating >= 7) {
                    found = true;
                    if (cost < minCost) {
                        minCost = cost;
                    }
                }
            }
            
            if (found) {
                System.out.println(minCost);
            } else {
                System.out.println(-1);
            }
        }
        
        scanner.close();
    }
}
