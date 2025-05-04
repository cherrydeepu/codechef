import java.util.Scanner;
class PendingAssignments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt(); // Number of test cases
        
        for (int i = 0; i < T; i++) {
            int X = scanner.nextInt(); // Number of assignments
            int Y = scanner.nextInt(); // Time per assignment in minutes
            int Z = scanner.nextInt(); // Number of days available

            int totalTimeRequired = X * Y;

            int totalAvailableTime = Z * 24 * 60;

            if (totalTimeRequired <= totalAvailableTime) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
