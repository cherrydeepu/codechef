import java.util.*;
import java.lang.*;
import java.io.*;

class PaintingWalls
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		for(int i=0;i<T;i++)
		{
		    int X=s.nextInt();
		    int Y=s.nextInt();
		    int Z=s.nextInt();
		    X=X*Y;
		    Z=Z/2;
		    System.out.println(Z/X);
		}
	}
}
