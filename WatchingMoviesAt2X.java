import java.util.Scanner;
class WatchingMoviesAt2x {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();  
        int Y = scanner.nextInt();  
        scanner.close();
        int timeSpent = (Y / 2) + (X - Y);
        System.out.println(timeSpent);
    }
}
