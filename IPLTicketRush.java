import java.util.*;
class Codechef{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int N=s.nextInt();
            int M=s.nextInt();
            if(N>M){
                System.out.println(N-M);
            }else{
                System.out.println(0);
            }
        }
    }
}