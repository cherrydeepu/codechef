import java.util.*;
class Codechef{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int A=s.nextInt();
            int B=s.nextInt();
            if(A==B){
                System.out.println("YES");
            }
            else
            {
                if((B-1)==(A+1))
                {
                    System.out.println("YES");
                }
                else
                {
                System.out.println("NO");
                }
            }
        }
    }
}