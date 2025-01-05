import java.util.*;
class Codechef{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int X=s.nextInt();
        if(X%2==0){
            X=X+X/2;
            System.out.println(X);
        }
    }
}