import java.util.*;
class Codechef{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int A=s.nextInt();
            int B=s.nextInt();
            if(B>A){
                System.out.println(7-B);
            }else{
                System.out.println(7-A);
            }
        }
    }
}