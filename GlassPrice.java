import java.util.*;
class Codechef{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int X=s.nextInt();
        int Y=s.nextInt();
        if(2*X<Y){
            System.out.println("PLASTIC");
        }else{
            System.out.println("METAL");
        }
    }
}