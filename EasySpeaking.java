import java.util.*;

class Main {
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();

            int count = 0;
            boolean hard = false;

            for (int i = 0; i < N; i++) {
                if (isVowel(S.charAt(i))) {
                    count = 0;
                } else {
                    count++;
                    if (count >= 4) {
                        hard = true;
                        break;
                    }
                }
            }

            if (hard)
                System.out.println("Yes");
            else
                System.out.println("No");
        }

        sc.close();
    }
}