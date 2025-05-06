import java.util.Scanner;

class HighAccuracy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // Number of test cases
        
        while (T-- > 0) {
            int X = sc.nextInt();  // Marks received
            int minIncorrect = Integer.MAX_VALUE;

            for (int c = 0; c <= 100; c++) {
                int w = 3 * c - X;
                if (w >= 0 && c + w <= 100) {
                    minIncorrect = Math.min(minIncorrect, w);
                }
            }

            System.out.println(minIncorrect);
        }

        sc.close();
    }
}

