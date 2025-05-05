import java.util.Scanner;

class ChefAndCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();  // Number of test cases
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();  // Number of children
            int X = sc.nextInt();  // Candies Chef already has

            int remaining = N - X;
            if (remaining <= 0) {
                System.out.println(0);
            } else {
                int packets = (remaining + 3) / 4;  // ceil(remaining / 4)
                System.out.println(packets);
            }
        }

        sc.close();
    }
}

