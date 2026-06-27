import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            int small = 100 * B;
            int large = 225 * A;

            if (small > large) {
                System.out.println("Small");
            } else if (small < large) {
                System.out.println("Large");
            } else {
                System.out.println("Equal");
            }
        }
    }
}