import java.util.*;
class MarioBullet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // number of test cases

        for (int i = 0; i < T; i++) {
            int X = sc.nextInt();  // speed in pixels per second
            int Y = sc.nextInt();  // distance to Goomba
            int Z = sc.nextInt();  // desired minimum hit time

            int timeToHit = Y / X;
            int delay = Z - timeToHit;

            // Mario can shoot immediately if delay <= 0
            System.out.println(Math.max(0, delay));
        }

        sc.close();
    }
}
