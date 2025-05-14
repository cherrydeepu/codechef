import java.util.Scanner;
class BuyTenPackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 
        while (T-- > 0) {
            int X = sc.nextInt(); 
            int Y = sc.nextInt(); 
            int minCost = Integer.MAX_VALUE;
            for (int fourPacketCount = 0; fourPacketCount <= 2; fourPacketCount++) {
                int packetsFromFour = fourPacketCount * 4;
                int remainingPackets = 10 - packetsFromFour;

                if (remainingPackets % 2 == 0) {
                    int twoPacketCount = remainingPackets / 2;
                    int cost = fourPacketCount * Y + twoPacketCount * X;
                    minCost = Math.min(minCost, cost);
                }
            }

            System.out.println(minCost);
        }

        sc.close();
    }
}
