import java.util.Scanner;
class ChefAndGym {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // Number of test cases

        for (int i = 0; i < T; i++) {
            int X = sc.nextInt();  // Gym cost
            int Y = sc.nextInt();  // Trainer cost
            int Z = sc.nextInt();  // Budget

            if (X + Y <= Z) {
                System.out.println(2);
            } else if (X <= Z) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        sc.close();
    }
}
