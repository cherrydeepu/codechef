import java.util.Scanner;
class FirstandLastDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt(); 
        
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int lastDigit = N % 10;
            
            int firstDigit = N;
            while (firstDigit >= 10) {
                firstDigit /= 10;
            }

            int sum = firstDigit + lastDigit;
            System.out.println(sum);
        }
        
        scanner.close();
    }
}
