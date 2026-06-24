import java.util.*;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();

        while (T-- > 0)
        {
            int W = s.nextInt();
            int P = s.nextInt();
            int K = s.nextInt();

            int wooden = Math.min(W, K);
            int plastic = K - wooden;

            int stylishness = 2 * wooden + plastic;

            System.out.println(stylishness);
        }
    }
}