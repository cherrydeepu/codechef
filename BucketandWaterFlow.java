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
            int W=s.nextInt();
            int X=s.nextInt();
            int Y=s.nextInt();
            int Z=s.nextInt();
            W=W+Y*Z;
            if(W>X){
                System.out.println("overFlow");
            }else if(W==X){
                System.out.println("filled");
            }else{
                System.out.println("Unfilled");
            }
        }
	}
}
