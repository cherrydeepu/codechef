import java.util.*;
class Codechef{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int X=s.nextInt();
            int Q=s.nextInt();
            int P=s.nextInt();
            System.out.println((Q-P)*X);
        }
    }
}