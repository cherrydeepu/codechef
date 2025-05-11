import java.util.Scanner;
class MinimumBottles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 
        while (T-- > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt(); 
            int totalWater = 0;
            for (int i = 0; i < N; i++) {
                totalWater += sc.nextInt(); 
            }
            int minBottles = (totalWater + X - 1) / X;
            System.out.println(minBottles);
        }

        sc.close();
    }
}
