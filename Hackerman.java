import java.util.Scanner;
class Hackerman{
    static boolean isPrime(int num) {
        return num == 2 || num == 3 || num == 5 || num == 7 || num == 11;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 
        while (T-- > 0) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int sum = A + B;
            if (isPrime(sum)) {
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }
        }

        scanner.close();
    }
}
