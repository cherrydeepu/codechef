import java.util.*;
class Codechef{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int H=s.nextInt();
        if(H<=24)
        {
            if(H==8)
            {
                System.out.println("PERFECT");
            }
            else if(H>8)
            {
                System.out.println("MORE");
            }
        else
        {
            System.out.println("LESS");
        }
        }
    }
}
        