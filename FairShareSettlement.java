import java.util.Scanner;
class FairShareSettlement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // Number of test cases

        while (T-- > 0) {
            int N = sc.nextInt();  // Total bill
            int K = sc.nextInt();  // Number of friends

            int totalPeople = K + 1;
            int fairShare = N / totalPeople;
            int reimbursed = K * fairShare;
            int netPayment = N - reimbursed;

            System.out.println(netPayment);
        }

        sc.close();
    }
}
