import java.util.Scanner;
class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // Number of test cases
        sc.nextLine(); // Consume the newline

        for (int i = 0; i < T; i++) {
            String number = sc.nextLine().trim(); // Read number as a string
            String reversed = new StringBuilder(number).reverse().toString();
            // Remove leading zeros
            reversed = reversed.replaceFirst("^0+(?!$)", "");
            System.out.println(reversed);
        }

        sc.close();
    }
}

