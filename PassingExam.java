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
            int Z = s.nextInt();

            int count = 0;

            if (X >= 50) count++;
            if (Y >= 50) count++;
            if (Z >= 50) count++;

            if (count >= 2)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}ss