import java.util.*;
class Codechef{
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++)
        {
        int X=s.nextInt();
        int Y=s.nextInt();
        if(X>Y)
        {
            System.out.println("LOSS");
        }
        else if(X==Y)
        {
            System.out.println("NEUTRAL");
        }
        else
        {
            System.out.println("PROFIT");
        }
        }
    }
}
