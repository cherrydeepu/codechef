import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int S = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();

            int free = S - X - Y;

            if (free >= Z) {
                System.out.println(0);
            } else if (free + Y >= Z || free + X >= Z) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }

        sc.close();
    }
}