import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            StringBuilder first = new StringBuilder();

            // Put all 1's first to make the palindrome smallest
            for (int i = 0; i < X / 2; i++) {
                first.append('1');
            }

            for (int i = 0; i < Y / 2; i++) {
                first.append('2');
            }

            StringBuilder ans = new StringBuilder(first);
            ans.append(first.reverse());

            System.out.println(ans);
        }

        sc.close();
    }
}