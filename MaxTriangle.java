import java.util.Scanner;
class MaxTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();  
        while (T-- > 0) {
            int N = sc.nextInt();  

            if (N > 3) {
                System.out.println(3 * N - 3);  
            } else {
                System.out.println(-1); 
            }
        }

        sc.close();
    }
}
