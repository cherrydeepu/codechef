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
            if((A + B) % 2 != 0 || (B + C) % 2 != 0 || (A + C) % 2 != 0) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
	}
}
