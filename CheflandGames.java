import java.util.*;
import java.lang.*;
import java.io.*;

class CheflandGames
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s = new Scanner(System.in);
	    int T = s.nextInt();
	    for (int i = 0; i < T; i++)
	    {
	        int R1 = s.nextInt();
	        int R2 = s.nextInt();
	        int R3 = s.nextInt();
	        int R4 = s.nextInt();
	        
	        if (R1 == 1 || R2 == 1 || R3 == 1 || R4 == 1) {
	            System.out.println("OUT");
	        } else {
	            System.out.println("IN");
	        }
	    }
	}
}


