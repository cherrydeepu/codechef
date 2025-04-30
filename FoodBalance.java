import java.util.*;
import java.lang.*;
import java.io.*;

class FoodBalance
{
	public static void main (String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    int F1=s.nextInt();
	    int P1=s.nextInt();
	    int F2=s.nextInt();
	    int P2=s.nextInt();
	    int diff1=Math.abs(F1-P1);
	    int diff2=Math.abs(F2-P2);
	    if(diff1>diff2){
	        System.out.println("Second");
	    }else if(diff1==diff2){
	        System.out.println("Both");
	    }else{
	        System.out.println("First");
	    }
	}
}
 