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
            A=100-(100*A/100);
            B=200-(200*B/100);
            if(A<B){
                System.out.println("FIRST");
            }else if(A>B){
                System.out.println("SECOND");
            }else{
                System.out.println("BOTH");
            }
        }
	}
}
