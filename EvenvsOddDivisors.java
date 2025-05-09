import java.util.Scanner;
class EvenOddDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();  
        while (T-- > 0) {
            int N = scanner.nextInt(); 
            int evenCount = 0;
            int oddCount = 0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0) {
                    if (i % 2 == 0) {
                        evenCount++;
                    } else {
                        oddCount++;
                    }
                }
            }
            if (evenCount > oddCount) {
                System.out.println(1);
            } else if (evenCount == oddCount) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
        }

        scanner.close();
    }
}
