import java.util.*;
class Codechef{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int X=s.nextInt();
            int H=s.nextInt();
            if(X<H){
                System.out.println("NO");
            }else if(X==H)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}