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
            int P=s.nextInt();
            int L=s.nextInt();
            L=(L*100)/P;
            if(L>=75){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
	}
}
