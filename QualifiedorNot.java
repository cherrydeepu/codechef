import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int X=s.nextInt();
		int Y=s.nextInt();
		if((N>=2*X) && (N>=2*Y)){
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}

	}
}
