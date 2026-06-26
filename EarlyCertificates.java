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

            String A = s.next();
            String B = s.next();

            int len = Math.min(N, M);

            StringBuilder ans = new StringBuilder();

            for (int i = 0; i < len; i++)
            {
                if (A.charAt(i) == B.charAt(i))
                {
                    ans.append(A.charAt(i));
                }
                else
                {
                    break;
                }
            }

            System.out.println(ans);
        }
    }
}