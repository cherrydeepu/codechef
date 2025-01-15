import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i=0;i<T;i++){
            int A=scanner.nextInt();
            int B=scanner.nextInt();
            int C=scanner.nextInt();
            if( A<B && (A+B)>C && B<C){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
