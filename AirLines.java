import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt();
            int N = sc.nextInt();

            int required = (N + 99) / 100;

            System.out.println(Math.max(0, required - X));
        }

        sc.close();
    }
}