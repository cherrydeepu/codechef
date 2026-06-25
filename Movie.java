import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		while(T-->0){
		    int N=s.nextInt();
		    int M=s.nextInt();
		    int A=s.nextInt();
		    int B=s.nextInt();
		    int C=s.nextInt();
		    int combo=Math.min(N,M);
		    int cost=combo*C + (N-combo)*A + (M-combo)*B;
		    System.out.println(cost);
		}

	}
}
