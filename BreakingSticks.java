import java.util.Scanner;
class BreakingSticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); 
            int totalBreaks = 0;

            for (int i = 0; i < N; i++) {
                int length = sc.nextInt();
                if (length >= 2) {
                    totalBreaks += (length - 1);
                }
            }

            System.out.println(totalBreaks);
        }

        sc.close();
    }
}

