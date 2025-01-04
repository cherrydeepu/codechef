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
            int M=s.nextInt();
            int X=s.nextInt();
            N=2*N;
            M=2*M;
            M=N+M;
            X=X*M;
            System.out.println(X);
        }
	}
}
