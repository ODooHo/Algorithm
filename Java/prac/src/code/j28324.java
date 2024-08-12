package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j28324 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] speed = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            speed[i] = Long.parseLong(st.nextToken());
        }

        long result = 1;
        int temp = 1;
        for (int i = N - 2; i >= 0; i--) {
            long current = speed[i];
            if (temp < current) {
                temp++;
            } else if (temp > current) {
                temp = (int) current;
            }
            result += temp;
        }

        System.out.println(result);


    }
}
