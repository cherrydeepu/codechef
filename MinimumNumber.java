import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt();

            if (X % 5 != 0) {
                System.out.println(-1);
            } else {
                System.out.println(X / 10 + (X % 10) / 5);
            }
        }

        sc.close();
    }
}