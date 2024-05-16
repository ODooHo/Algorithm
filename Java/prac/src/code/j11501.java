package code;

import java.io.*;
import java.util.StringTokenizer;

public class j11501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[] num;
        int T = Integer.parseInt(br.readLine());

        for (int x = 0; x < T; x++) {
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            num = new int[n];
            long answer = 0;
            for (int i = 0; i < n; i++) {
                num[i] = Integer.parseInt(st.nextToken());
            }
            int max = num[n - 1];

            for (int j = n - 2; j >= 0; j--) {
                if (num[j] <= max) {
                    answer += max - num[j];
                } else {
                    max = num[j];
                }
            }
            sb.append(answer + "\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}
