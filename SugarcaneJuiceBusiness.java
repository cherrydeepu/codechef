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
            int N=s.nextInt();
            N=N*50-(N*50*20/100)-(N*50*20/100)-(N*50*30/100);
            System.out.println(N);
        }
	}
}
