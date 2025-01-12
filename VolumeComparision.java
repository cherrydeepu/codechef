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
        int C=s.nextInt();
        int X=s.nextInt();
        A=A*B*C;
        X=X*X*X;
        if(A>X){
            System.out.println("Cuboid");
        }else if(A<X){
            System.out.println("Cube");
        }else{
            System.out.println("Equal");
        }
	}
}
