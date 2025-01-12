import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner s=new Scanner(System.in);
        int X=s.nextInt();
        int N=s.nextInt();
        X=X-(N*10);
        if(X>=0){
            System.out.println(X/20);
        }else{
            System.out.println(0);
        }
	}
}
