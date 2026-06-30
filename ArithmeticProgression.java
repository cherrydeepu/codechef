import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();

            if (2 * Y == X + Z)
                System.out.println(0);
            else
                System.out.println(1);
        }

        sc.close();
    }
}s