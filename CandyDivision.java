import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) 
	{
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int N=s.nextInt();
            if(N%3==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
	}
}
