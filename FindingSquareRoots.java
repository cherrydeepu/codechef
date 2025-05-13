import java.util.Scanner;
class FindingSquareRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int sqrt = (int)Math.sqrt(N); 
            System.out.println(sqrt);
        }
        
        sc.close();
    }
}

