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
            int R1=s.nextInt();
            int R2=s.nextInt();
            int R3=s.nextInt();
            int R4=s.nextInt();
            int R5=s.nextInt();
            R1=R1+R2+R3+R4+R5;
            if(R1>3){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
	}
}
