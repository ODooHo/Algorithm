package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j20922 {
    static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] num = new int[n];
        result = new int[100001];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;

        int start = 0;
        int end = 1;
        result[num[start]]++;
        while (end < n) {
            // 늘릴 수 있으면 end 증가
            while (end < n && result[num[end]] + 1 <= k) {
                result[num[end++]]++;
            }
            // 더이상 늘릴 수 없음
            int len = end - start;
            if (max < len) {
                max = len;
            }

            //start 이동
            result[num[start++]]--;
        }
        System.out.print(max);
    }


}
