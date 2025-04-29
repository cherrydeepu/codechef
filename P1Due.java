import java.util.*;
import java.lang.*;
import java.io.*;
class P1Due
{
	public static void main (String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    int X=s.nextInt();
	    int Y=s.nextInt();
	    if(X<=Y || X==Y)
        {
	        System.out.println("YES");
	    }else
        {
	        System.out.println("NO");
	    }
	}
}
