import java.util.Scanner;

class SevenRings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();  // Number of test cases

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();  // Number of items
            int X = sc.nextInt();  // Cost per item

            int total = N * X;

            // Check if the total is a 5-digit number with no leading zero
            if (total >= 10000 && total <= 99999) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
