import java.util.*;
import java.lang.*;
import java.io.*;

class ChristmasGifts
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();  // Number of test cases
        
        for(int i = 0; i < T; i++) {
            int H = s.nextInt();
            int L = s.nextInt();
            int W = s.nextInt();
            
            // Correct surface area formula
            int surfaceArea = 2 * (H * L + H * W + L * W);
            int maxGifts = 1000 / surfaceArea;  // Integer division for complete gifts
            
            System.out.println(maxGifts);
        }
        
        s.close();
    }
}
