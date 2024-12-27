import java.util.*;
class Codehcef{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int X=s.nextInt();
        int Y=s.nextInt();
        if(X>Y && X>=2*Y){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}