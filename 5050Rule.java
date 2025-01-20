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
            int Y=s.nextInt();
            if(X<50){
                System.out.println("Z");
            }else if(Y<50 && X>=50){
                System.out.println("F");
            }else{
                System.out.println("A");
            }
        }
	}
}
