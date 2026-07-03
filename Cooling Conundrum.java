import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int time = 0;

            while (X > Y) {
                time += (X + 9) / 10;   // ceil(X / 10)
                X--;
            }

            System.out.println(time);
        }

        sc.close();
    }
}