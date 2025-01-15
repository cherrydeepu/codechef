import java.util.Scanner;
class Codechef {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while (T-- > 0) {
            int X = s.nextInt(); 
            int Y = s.nextInt(); 
            Y = Y + (X / 10);
            System.out.println(Y);
        }
    }
}
