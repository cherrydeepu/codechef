import java.util.Scanner;
class RunForFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt(); // Distance Chef can run before resting
        int Y = sc.nextInt(); // Total race distance
        
        int restStops = (Y - 1) / X;
        
        System.out.println(restStops);
        
        sc.close();
    }
}
