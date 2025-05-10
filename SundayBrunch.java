import java.util.*;
class SundayBrunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  
        for (int i = 0; i < T; i++) {
            int X = sc.nextInt();  
            int Y = sc.nextInt();
            int people = X / Y;
            if (people > 20) {
                people = 20;
            }

            System.out.println(people);
        }

        sc.close();
    }
}

