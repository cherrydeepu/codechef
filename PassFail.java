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
            int A=s.nextInt();
            int B=s.nextInt();
            int C=s.nextInt();
            if(A>=10 && B>=10 && C>=10 && (A+B+C)>=100)
            {
                System.out.println("PASS");
            }else{
                System.out.println("FAIL");
            }
        }
	}
}
