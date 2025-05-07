import java.util.Scanner;
class ElectionsInChefland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); 
            int X = sc.nextInt(); 

            int eligible = 0;
            for (int i = 0; i < N; i++) {
                int age = sc.nextInt();
                if (age >= X) {
                    eligible++;
                }
            }

            System.out.println(eligible);
        }

        sc.close();
    }
}
