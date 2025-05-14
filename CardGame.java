import java.util.Scanner;
class CardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  
        while (T-- > 0) {
            int N = sc.nextInt(); 
            int X = sc.nextInt(); 
            int oddCount = (N + 1) / 2;
            int evenCount = N / 2;
            if (X % 2 == 0) {
                evenCount--;
                System.out.println(evenCount);
            } else {
                oddCount--;
                System.out.println(oddCount);
            }
        }

        sc.close();
    }
}

