import java.util.Scanner;
class FindingShoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); 
            int M = scanner.nextInt(); 
            int leftShoesNeeded = Math.max(0, N - M); 
            int totalToBuy = N + leftShoesNeeded;     
            System.out.println(totalToBuy);
        }
        
        scanner.close();
    }
}
