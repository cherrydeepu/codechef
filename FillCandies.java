import java.util.Scanner;
class FillCandies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            int M = scanner.nextInt(); 
            int maxCandiesPerBag = K * M;
            int bagsNeeded = (N + maxCandiesPerBag - 1) / maxCandiesPerBag;
            System.out.println(bagsNeeded);
        }

        scanner.close();
    }
}
