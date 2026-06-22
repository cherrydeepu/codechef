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
		if(Math.abs(X-Y)<=2){
		    System.out.println("Interesting");
		}else{
		    System.out.println("Boring");
		}
	}
}