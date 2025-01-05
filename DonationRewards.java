import java.util.*;
class Codechef{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int X=s.nextInt();
            if(X<=3){
                System.out.println("BRONZE");
            }else if(X>3 && X<=6){
                System.out.println("SILVER");
            }else{
                System.out.println("GOLD");
            }
        }
    }
}