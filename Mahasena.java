import java.util.Scanner;

class Mahasena {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int N = s.nextInt();  // Number of soldiers
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < N; i++) {
            int weapons = s.nextInt();
            if (weapons % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        if (evenCount > oddCount) {
            System.out.println("READY FOR BATTLE");
        } else {
            System.out.println("NOT READY");
        }

        s.close();
    }
}
