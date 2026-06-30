import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int need = 50 - X;

            if (need >= 2 * Y && need <= 2 * Y + 10)
                System.out.println("Yes");
            else
                System.out.println("No");
        }

        sc.close();
    }
}