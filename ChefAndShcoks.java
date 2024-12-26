import java.util.*;
class Codechef{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int X=s.nextInt();
        int Y=s.nextInt();
        int Z=s.nextInt();
        if(X<(Y+Z)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}