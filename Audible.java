import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		for(int i=0;i<T;i++){
		    int X=s.nextInt();
		    if(X>=67 && X<=45000){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}

	}
}