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
            int Y = s.nextInt();
            int N = s.nextInt();

            System.out.println(Math.max(0, X - Y * N));
        }
    }
}