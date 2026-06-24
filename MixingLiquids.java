import java.util.*;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();

        while (T-- > 0)
        {
            int A = s.nextInt();
            int B = s.nextInt();

            int k = Math.min(A, B / 2);

            System.out.println(3 * k);
        }
    }
}