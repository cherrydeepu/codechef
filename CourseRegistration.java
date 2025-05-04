import java.util.Scanner;
class CourseRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt(); // Number of test cases
        
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt(); // Number of friends
            int M = scanner.nextInt(); // Maximum capacity
            int K = scanner.nextInt(); // Already registered students

            if (N + K <= M) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        scanner.close();
    }
}
