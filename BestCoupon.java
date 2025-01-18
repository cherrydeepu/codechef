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
            int X=s.nextInt();
            if(X<1000){
                X=X/100;
                System.out.println(X/X*100);
            }else{
                System.out.println(X/10);
            }
        }
	}
}
