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
            int K = s.nextInt();

            int totalMinutes = N * K;

            int H = totalMinutes / 60;
            int M = totalMinutes % 60;

            System.out.println(H + " " + M);
        }
    }
}