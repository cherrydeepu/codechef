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
            int totalCost = 0;

            for (int i = 1; i <= N; i++)
            {
                int balloons = s.nextInt();
                totalCost += balloons * i;
            }

            System.out.println(totalCost);
        }
    }
}