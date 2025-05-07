import java.util.Scanner;
class TestScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); 

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); 
            int X = sc.nextInt(); 
            int Y = sc.nextInt(); 

            if (Y % X == 0 && (Y / X) <= N) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
