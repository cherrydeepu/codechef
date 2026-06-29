import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            String s = sc.next();

            int[] freq = new int[26];

            for (int i = 0; i < N; i++) {
                freq[s.charAt(i) - 'a']++;
            }

            boolean possible = false;

            for (int i = 0; i < 26; i++) {
                if (freq[i] >= 2) {
                    possible = true;
                    break;
                }
            }

            System.out.println(possible ? "Yes" : "No");
        }
    }
}