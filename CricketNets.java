import java.util.*;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();

        while (T-- > 0)
        {
            int X = s.nextInt();

            if (X <= 20)
            {
                System.out.println(X * 10);
            }
            else
            {
                int cost = 200 + ((X - 20) / 2) * 5;
                System.out.println(cost);
            }
        }
    }
}