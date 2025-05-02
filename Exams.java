import java.util.Scanner;
 class Exams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases

        for (int i = 0; i < T; i++) {
            int X = sc.nextInt(); // Number of schools
            int Y = sc.nextInt(); // Students per school
            int Z = sc.nextInt(); // Students who passed

            int totalStudents = X * Y;

            if (Z > totalStudents / 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}

