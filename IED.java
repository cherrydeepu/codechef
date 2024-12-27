import java.util.*;
class Codechef{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int A=s.nextInt();
        int B=s.nextInt();
        int C=s.nextInt();
        A=A*C;
        B=B*C;
        if(A>B){
            System.out.println(A);
        }else{
            System.out.println(B);
        }
    }
}