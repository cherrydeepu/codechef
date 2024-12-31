import java.util.*;
class Codechef{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int N=s.nextInt();
            int X=s.nextInt();
            int Y=s.nextInt();
            if(X+(Y*2)<=N){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}