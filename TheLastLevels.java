import java.util.Scanner;
class TheLastLevels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();  
        for (int t = 0; t < T; t++) {
            int X = scanner.nextInt(); 
            int Y = scanner.nextInt(); 
            int Z = scanner.nextInt(); 

            int levelTime = X * Y;
            int breaks = (X - 1) / 3;
            int totalTime = levelTime + breaks * Z;

            System.out.println(totalTime);
        }
        
        scanner.close();
    }
}
