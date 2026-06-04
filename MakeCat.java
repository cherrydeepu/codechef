import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		char[] arr=str.toCharArray();
		Arrays.sort(arr);
		if(new String(arr).equals("act")){
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}

	}
}
