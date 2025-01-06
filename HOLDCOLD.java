import java.util.*;
class Codechef{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int C=s.nextInt();
            if(C>20){
                System.out.println("HOT");
            }else{
                System.out.println("COLD");
            }
        }
    }
}