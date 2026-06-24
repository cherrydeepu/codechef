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
            int M = s.nextInt();

            int time = 0;

            for (int i = N; i > M; i--)
            {
                time += i;
            }

            System.out.println(time);
        }
    }
}