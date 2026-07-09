import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int online = N * 90;   // Compare in percentage form
            int dining = M * 100;

            if (online < dining)
                System.out.println("ONLINE");
            else if (online > dining)
                System.out.println("DINING");
            else
                System.out.println("EITHER");
        }

        sc.close();
    }
}