import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner s=new Scanner(System.in);
        int X=s.nextInt();
        int Y=s.nextInt();
        int Z=s.nextInt();
        if(Z<=50){
            System.out.println(X);
        }else{
            Z=Z-50;
            System.out.println(X+(Z*Y));
        }

	}
}
