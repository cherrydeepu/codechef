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
            int X = s.nextInt();
            int Y = s.nextInt();

            int count = 0;

            for (int i = 0; i < N; i++)
            {
                int weight = s.nextInt();

                if (weight >= X && weight <= Y)
                {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}