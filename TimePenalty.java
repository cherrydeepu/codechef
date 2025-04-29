import java.util.*;
import java.lang.*;
import java.io.*;

class TimePenalty
{
	public static void main (String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int X=s.nextInt();
		int Y=s.nextInt();
		if(X<=150 & Y<=10)
		{
		    System.out.println(X+Y*10);   
		}
	}
