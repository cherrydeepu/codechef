import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int A=s.nextInt();
		int B=s.nextInt();
		int slices=(A+1)*4+B*3;
		int pizzas=(slices+7)/8;
		System.out.println(pizzas);

	}
}
