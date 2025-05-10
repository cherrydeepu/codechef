import java.util.*;
class TallestMountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); 
            int maxHeight = Integer.MIN_VALUE;

            for (int i = 0; i < N; i++) {
                int height = sc.nextInt();
                if (height > maxHeight) {
                    maxHeight = height;
                }
            }

            System.out.println(maxHeight);
        }

        sc.close();
    }
}