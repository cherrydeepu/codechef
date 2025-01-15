import java.util.Scanner;

class CodeChef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        double Y = scanner.nextDouble();
        if (X % 5 == 0 && X + 0.50 <= Y) {
            Y = Y - X - 0.50; 
        }
        System.out.printf("%.2f%n", Y);
    }
}