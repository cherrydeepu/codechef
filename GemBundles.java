import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int R = sc.nextInt();
            int B = sc.nextInt();
            int G = sc.nextInt();

            int bundles = Math.min(R, Math.min(B, G));

            int coins = bundles * 10
                      + (R - bundles) * 3
                      + (B - bundles) * 3
                      + (G - bundles) * 3;

            System.out.println(coins);
        }
    }
}