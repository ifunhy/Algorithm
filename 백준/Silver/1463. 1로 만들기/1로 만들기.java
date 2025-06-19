import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        br.close();

        System.out.println(make1(N));
    }

    static int make1(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 0;


        for (int i = 2; i <= n; i++) {
            int m = dp[i - 1];

            if (i % 2 == 0)
                m = Math.min(m, dp[i / 2]);
            if (i % 3 == 0)
                m = Math.min(m, dp[i / 3]);
            dp[i] = m + 1;
        }
        return (dp[n]);
    }
}