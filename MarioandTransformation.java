import java.util.*;
class MarioandTransformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  
        String[] states = {"NORMAL", "HUGE", "SMALL"};  
        for (int i = 0; i < T; i++) {
            int X = sc.nextInt();  
            int index = (0 + X) % 3;  
            System.out.println(states[index]);
        }

        sc.close();
    }
}
