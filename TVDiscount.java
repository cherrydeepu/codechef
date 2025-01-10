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
            int D=s.nextInt();
            A=A-C;
            B=B-D;
            if(A==B){
                System.out.println("Any");
            }else if(A>B){
                System.out.println("Second");
            }else{
                System.out.println("First");
            }
        }
	}
}
