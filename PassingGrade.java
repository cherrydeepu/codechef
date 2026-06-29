import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int chefMarks = A[0];
            int count = 0;

            for (int i = 0; i < N; i++) {
                if (A[i] >= chefMarks) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}