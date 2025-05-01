import java.util.*;
import java.lang.*;
import java.io.*;

class PracticeMakesUsPerfect
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner s = new Scanner(System.in);
        int P1 = s.nextInt();
        int P2 = s.nextInt();
        int P3 = s.nextInt();
        int P4 = s.nextInt();
        
        int count = 0;
        if (P1 >= 10) count++;
        if (P2 >= 10) count++;
        if (P3 >= 10) count++;
        if (P4 >= 10) count++;
        
        System.out.println(count);
	}
}
