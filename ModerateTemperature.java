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
            int[] A = new int[N];

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < N; i++)
            {
                A[i] = s.nextInt();

                if (A[i] < min)
                    min = A[i];

                if (A[i] > max)
                    max = A[i];
            }

            int count = 0;

            for (int i = 0; i < N; i++)
            {
                if (A[i] != min && A[i] != max)
                {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}