import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int R=s.nextInt();
		int B=s.nextInt();
		int P=s.nextInt();
		int Q=s.nextInt();
		R=R*P;
		B=B*Q;
		if(R<+B){
		    System.out.println(B);
		}else{
		    System.out.println(R);
		}

	}
}
