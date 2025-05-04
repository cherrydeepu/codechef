import java.util.Scanner;
class FavouriteNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt(); // Number of test cases
        
        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt(); // The number to evaluate
            
            if (A % 2 == 0 && A % 7 == 0) {
                System.out.println("Alice");
            } else if (A % 2 == 1 && A % 9 == 0) {
                System.out.println("Bob");
            } else {
                System.out.println("Charlie");
            }
        }

        scanner.close();
    }
}

