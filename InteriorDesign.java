import java.util.*;
class Codechef{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int X1=s.nextInt();
            int Y1=s.nextInt();
            int X2=s.nextInt();
            int Y2=s.nextInt();
            if((X1+Y1)<=(X2+Y2)){
                System.out.println(X1+Y1);
            }else{
                System.out.println(X2+Y2);
            }
        }
    }
}