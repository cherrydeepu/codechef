import java.util.Scanner;
class NearestMultipleOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        // Get the two nearest multiples of 3
        int lower = (N / 3) * 3;
        int higher = lower + 3;

        // Find which one is closer to N
        if (Math.abs(N - lower) <= Math.abs(N - higher)) {
            System.out.println(lower);
        } else {
            System.out.println(higher);
        }

        sc.close();
    }
}
