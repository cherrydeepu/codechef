import java.util.Scanner;
class OppositeAttract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 
        while (T-- > 0) {
            int N = sc.nextInt(); 
            String S = sc.next(); 
            StringBuilder T_str = new StringBuilder();
            for (int i = 0; i < N; i++) {
                char c = S.charAt(i);
                // Flip the bit
                if (c == '0') {
                    T_str.append('1');
                } else {
                    T_str.append('0');
                }
            }
            System.out.println(T_str.toString());
        }

        sc.close();
    }
}
