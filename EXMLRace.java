import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();

            int maxSpeed = -1;
            int ans = 1;

            for (int i = 1; i <= N; i++) {
                int d = sc.nextInt();
                int t = sc.nextInt();

                int speed = d / t;

                if (speed > maxSpeed) {
                    maxSpeed = speed;
                    ans = i;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}