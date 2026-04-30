import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int X=s.nextInt();
		int Y=s.nextInt();
		Y=Y-X;
		X=X*100;
		Y=Y*150;
		System.out.println(X+Y);

	}
}
