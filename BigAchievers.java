import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());

            int max = 0;

            for (int i = 0; i < N; i++) {
                int x = Integer.parseInt(st.nextToken());

                if (x > max) {
                    ans.append("1");
                    max = x;
                } else {
                    ans.append("0");
                }

                if (i != N - 1)
                    ans.append(" ");
            }
            ans.append("\n");
        }

        System.out.print(ans);
    }
}