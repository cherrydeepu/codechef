import java.util.*;
class Codechef{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int X=s.nextInt();
            if(X<100){
                System.out.println(X);
            }else if(X>100){
                System.out.println(X-10);
            }else{
                System.out.println(X);
            }
        }
    }
}