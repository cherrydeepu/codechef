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
            if(N%4==0)
            {
            System.out.println(N/4);
            }else{
                System.out.println((N/4)+1);
            }
        }
	}
}
