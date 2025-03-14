package code;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class j15341 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            int[] inputArr = new int[17];
            int[] validateArr = new int[17];

            StringBuilder temp = new StringBuilder();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 4; i++) {
                temp.append(st.nextToken());
            }
            if (temp.toString().equals("0000000000000000")) {
                bw.append(sb.toString());
                bw.flush();
                return;
            }
            for (int i = 1; i < 17; i++) {
                inputArr[i] = temp.charAt(i-1) - '0';
            }
            validateArr = inputArr.clone();

            for (int i = 1; i < 17; i += 2) {
                validateArr[i] *= 2;
                if (validateArr[i] > 9) {
                    validateArr[i] -= 9;
                }
            }
            int sum = 0;
            for (int i = 1; i < 17; i++) {
                sum += validateArr[i];
            }
            if (sum % 10 == 0) {
                sb.append("Yes\n");
            } else {
                sb.append("No\n");
            }
        }
    }
}
