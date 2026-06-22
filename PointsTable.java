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
		int A=s.nextInt();
		int B=s.nextInt();
		if(X>A){
		    System.out.println("Alice");
		}else if(A>X){
		    System.out.println("Bob");
		}else{
		    if(Y>B){
		        System.out.println("Alice");
		    }else if(B>Y){
		        System.out.println("Bob");
		    }else{
		        System.out.println("Alice");
		    }
		}
	}
}
s