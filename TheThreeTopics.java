import java.util.Scanner;

public class TheThreeTopics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read 4 space-separated integers
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();

        // Check if X is one of the prepared topics
        if (X == A || X == B || X == C) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
