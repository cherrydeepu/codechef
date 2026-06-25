import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here=
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		while(T-->0){
		    int X=s.nextInt();
		    int Y=s.nextInt();
		    int alice=(X+Y)/2;
		    int bob=Y-alice;
		    System.out.println(alice + " " + bob);
		}

	}
}
