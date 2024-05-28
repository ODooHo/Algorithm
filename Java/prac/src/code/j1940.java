package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class j1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] material = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            material[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(material);

        int start = 0;
        int end = N - 1;
        int cnt = 0;

        while (start < end) {
            int temp = material[start] + material[end];
            if (temp == M) {
                cnt += 1;
                start += 1;
                end -= 1;
            } else if (temp > M) {
                end -= 1;
            } else if (temp < M) {
                start += 1;
            }
        }

        System.out.println(cnt);


    }
}
