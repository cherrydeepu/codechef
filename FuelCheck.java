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
	    X=X*Y;
	    if(X>=100){
	        System.out.println("Yes");
	    }else{
	        System.out.println("No");
	    }
	}
}
