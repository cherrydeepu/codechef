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
            int B1=s.nextInt();
            int B2=s.nextInt();
            int B3=s.nextInt();
            if((B1==0 && B2==0) || (B1==0 && B3==0) || (B2==0 && B3==0)){
                System.out.println("Water filling time");
            }else{
                System.out.println("Not now");
            }
        }
	}
}
