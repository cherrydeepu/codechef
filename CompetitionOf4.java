import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int X=s.nextInt();
		int prize=1000*(1<<(4-X));
		System.out.println(prize);

	}
}
