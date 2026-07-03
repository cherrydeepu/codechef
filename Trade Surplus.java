import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int A1 = sc.nextInt();
            int A2 = sc.nextInt();
            int B1 = sc.nextInt();
            int B2 = sc.nextInt();

            int netAB = (A1 - A2) + (B1 - B2);

            if (netAB < 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}