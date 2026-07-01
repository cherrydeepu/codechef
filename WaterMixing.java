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
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if (B > A) {
                if (B - A <= X)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            } else if (B < A) {
                if (A - B <= Y)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

        sc.close();
    }
}