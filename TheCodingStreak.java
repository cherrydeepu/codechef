import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();

            int current = 0;
            int max = 0;

            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();

                if (x > 0) {
                    current++;
                    if (current > max)
                        max = current;
                } else {
                    current = 0;
                }
            }

            System.out.println(max);
        }
    }
}