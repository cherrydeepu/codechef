import java.util.Scanner;
class MoveGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read four integers
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        
        // Compute final coordinates
        int x = A - C;
        int y = B - D;
        
        // Output the result
        System.out.println(x + " " + y);
        
        sc.close();
    }
}
