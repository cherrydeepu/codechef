import java.util.*;
class Codechef{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        for(int i=0;i<N;i++){
            int X=s.nextInt();
            int Y=s.nextInt();
            int Z=s.nextInt();
            if(X>Y && X>Z){
                System.out.println((Y>Z)?Y:Z);
            }else if(Y>X && Y>Z){
                System.out.println((X>Z)?X:Z);
            }else{
                System.out.println((X>Y)?X:Y);
            }
        }
    }
}