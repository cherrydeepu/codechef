import java.util.*;
class Codechef
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            int X=s.nextInt();
            if(X<=10)
            {
                System.out.println("YES");
            }else
            {
                System.out.println("NO");
            }
        }
    }
}    