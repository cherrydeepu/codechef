import java.util.*;
class SumOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt(); 
        for (int i = 0; i < T; i++) 
        {
            int N = s.nextInt();
            int Sum = 0;

            while (N != 0) 
            {
                Sum = Sum + (N % 10); 
                N = N / 10;           
            }

            System.out.println(Sum);
        }

    }
}
