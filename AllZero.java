import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            if (C % 3 == 0 && (2 * A + C / 3 == B)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}