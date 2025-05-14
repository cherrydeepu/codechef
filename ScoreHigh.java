import java.util.Scanner;
class ScoreHigh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 
        while (T-- > 0) {
            int N = sc.nextInt();  
            int NA = sc.nextInt();
            int NB = sc.nextInt();
            int NC = sc.nextInt();
            int ND = sc.nextInt();
            int maxCorrect = Math.max(Math.max(NA, NB), Math.max(NC, ND));

            System.out.println(maxCorrect);
        }

        sc.close();
    }
}
