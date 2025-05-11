import java.util.Scanner;
class ChefAndWaterBottles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt(); 
            int K = sc.nextInt(); 
            int filled = Math.min(N, K / X);
            System.out.println(filled);
        }

        sc.close();
    }
}
