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

            HashSet<Integer> colors = new HashSet<>();

            for (int i = 0; i < N; i++)
            {
                colors.add(s.nextInt());
            }

            System.out.println(colors.size());
        }
    }
}