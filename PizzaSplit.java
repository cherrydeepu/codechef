import java.util.Scanner;
class PizzaSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  
        scanner.close();
        int result = (N % 2 == 0) ? 1 : 2;
        System.out.println(result);
    }
}
