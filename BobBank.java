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
            if(X<=12){
                System.out.println(W+(X-Y)*Z);
            }else{
                System.out.println(W-(Y-X)*Z);
            }
        }
	}
}
