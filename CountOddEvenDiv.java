import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();

        while (T-- > 0)
        {
            int N = s.nextInt();

            int odd = 0;
            int even = 0;

            for (int i = 1; i <= N; i++)
            {
                if (N % i == 0)
                {
                    if (i % 2 == 0)
                    {
                        even++;
                    }
                    else
                    {
                        odd++;
                    }
                }
            }

            System.out.println(odd + " " + even);
        }
    }
}