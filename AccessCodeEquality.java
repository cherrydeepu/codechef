import java.util.Scanner;
class AccessCodeEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String S = sc.nextLine();
        
        // Check for exact match (case-sensitive)
        if (S.equals("WECNITK")) {
            System.out.println("Welcome to Web Club!");
        } else {
            System.out.println("Access denied");
        }
        
        sc.close();
    }
}
