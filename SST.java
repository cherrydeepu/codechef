import java.util.Scanner;
class SastaSharkTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // Number of test cases
        
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt(); 
            int B = sc.nextInt();
            
            int val1 = 10 * A; 
            int val2 = 5 * B;  
            
            if (val1 > val2) {
                System.out.println("FIRST");
            } else if (val1 < val2) {
                System.out.println("SECOND");
            } else {
                System.out.println("ANY");
            }
        }

        sc.close();
    }
}

