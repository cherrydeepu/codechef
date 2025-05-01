import java.util.*;
import java.lang.*;
import java.io.*;

class MinimumPizza
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for (int i = 0; i < T; i++)
		{
		    int N = s.nextInt(); 
		    int X = s.nextInt(); 
		    N = N * X;
		    System.out.println((N + 3) / 4);
		}
	}
}
