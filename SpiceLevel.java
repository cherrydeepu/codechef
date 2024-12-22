import java.util.*;
class Codechef{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int X=s.nextInt();
            if(X<4){
                System.out.println("MILD");
            }else if(X>=4 && X<7){
                System.out.println("MEDIUM");
            }else{
                System.out.println("HOT");
            }
        }
    }
}