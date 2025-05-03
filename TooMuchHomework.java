import java.util.Scanner;

class TooMuchHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input
        int X = sc.nextInt(); // Questions already answered
        int Y = sc.nextInt(); // Questions per worksheet
        
        // Calculate the maximum possible questions
        int maxPossible = X + 10 * Y;
        
        // Output result
        if (maxPossible >= 100) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
