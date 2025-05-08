import java.util.Scanner;
class GymkhanaElection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); 
            int M = scanner.nextInt(); 
            int omVotes = (M / 2) + 1;
            System.out.println(omVotes);
        }

        scanner.close();
    }
}
