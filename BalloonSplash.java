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
		if(X>Y){
		    System.out.println("Alice");
		}else if(X<Y){
		    System.out.println("Bob");
		}else{
		    System.out.println("Draw");
		}

	}
}
