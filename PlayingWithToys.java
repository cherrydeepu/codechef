import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        if(N<M){
            System.out.println(0);
        }else{
            System.out.println(N-M);
        }
	}
}
