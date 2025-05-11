import java.util.Scanner;
class ComplementaryStrandDNA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next(); 
            StringBuilder complement = new StringBuilder();
            for (int i = 0; i < N; i++) {
                char ch = S.charAt(i);
                switch (ch) {
                    case 'A':
                        complement.append('T');
                        break;
                    case 'T':
                        complement.append('A');
                        break;
                    case 'C':
                        complement.append('G');
                        break;
                    case 'G':
                        complement.append('C');
                        break;
                }
            }

            System.out.println(complement);
        }

        sc.close();
    }
}

