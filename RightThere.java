import java.util.*;
class Codechef{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int N=s.nextInt();
            int X=s.nextInt();
            if(N>X){
                System.out.println("NO");
            }else if(N==X){
                System.out.println("YES");
            }else{
                System.out.println("YES");
            }
        }
    }
}