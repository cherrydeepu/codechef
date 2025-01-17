import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int C=s.nextInt();
            int X=s.nextInt();
            int Y=s.nextInt();
            C=C-X;
            Y=C*Y;
            System.out.println(Y);
        }
	}
}
