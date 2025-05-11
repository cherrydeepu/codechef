import java.util.Scanner;
class ChangeRowAndColumnBoth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int sx = sc.nextInt();
            int sy = sc.nextInt();
            int ex = sc.nextInt();
            int ey = sc.nextInt();

            if (sx != ex && sy != ey) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }

        sc.close();
    }
}
