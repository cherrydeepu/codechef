import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for(int i = 0; i < T; i++){
            int R1 = s.nextInt();
            int R2 = s.nextInt();
            int R3 = s.nextInt();
            if (R1 > R2 + R3 || R2 > R1 + R3 || R3 > R1 + R2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        s.close();
    }
}
