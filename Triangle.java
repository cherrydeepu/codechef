import java.util.*;
import java.lang.*;
import java.io.*;

class Triangle
{
	public static void main (String[] args) 
	{
        Scanner s=new Scanner(System.in);
        int A=s.nextInt();
        int B=s.nextInt();
        int C=s.nextInt();
        if(A+B>C && B+C>A && A+C>B){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
	}
}

