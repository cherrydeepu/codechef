import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int[] a = {x, y, z};
            Arrays.sort(a);

            int ans = Math.max(0, a[2] - (a[0] + a[1]) + 1);

            System.out.println(ans);
        }

        sc.close();
    }
}