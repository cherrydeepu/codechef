import java.util.Scanner;
class MangoTruck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < T; i++) {
            int X = scanner.nextInt(); // Weight of one mango
            int Y = scanner.nextInt(); // Weight of the truck
            int Z = scanner.nextInt(); // Max weight bridge can withstand

            // Maximum mangoes that can be loaded = floor((Z - Y) / X)
            int maxMangoes = (Z - Y) / X;

            System.out.println(maxMangoes);
        }

        scanner.close();
    }
}
