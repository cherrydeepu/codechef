import java.util.*;
class Codechef{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int X=s.nextInt();
            int Y=s.nextInt();
            int Z=s.nextInt();
            X=4*X;
            Y=2*Y;
            Z=0*Z;
            System.out.println(X+Y+Z);
        }
    }
}