import java.util.Scanner;
class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt(); 

            int minChildren = (N + 1) / 2;
            int maxChildren = N;

            System.out.println(minChildren + " " + maxChildren);
        }

        sc.close();
    }
}
