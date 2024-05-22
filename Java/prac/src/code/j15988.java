package code;

import java.io.*;

public class j15988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        long[] dp = new long[1000001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i < 1000001; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % 1000000009;
        }

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            long temp = dp[n];
            bw.write(temp + "\n");
        }

        bw.flush();
        bw.close();
    }
}
