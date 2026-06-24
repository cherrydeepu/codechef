import java.util.*;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();

        while (T-- > 0)
        {
            int N = s.nextInt();
            String str = s.next();

            int aCount = 0;
            int bCount = 0;

            for (int i = 0; i < N; i++)
            {
                if (str.charAt(i) == 'a')
                    aCount++;
                else
                    bCount++;
            }

            System.out.println(aCount + " " + bCount);
        }
    }
}