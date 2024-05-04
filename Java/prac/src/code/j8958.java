package code;

import java.io.*;
import java.util.Arrays;

public class j8958 {
    static int T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String temp = br.readLine();
            char[] quiz = temp.toCharArray();
            int[] result = new int[quiz.length];
            if (quiz[0] == 'O') {
                result[0] = 1;
            } else {
                result[0] = 0;
            }
            for (int j = 1; j < quiz.length; j++) {
                if (quiz[j] == 'O') {
                    result[j] = result[j - 1] + 1;
                } else {
                    result[j] = 0;
                }
            }
            int sum = Arrays.stream(result).sum();
            bw.write(sum + "\n");
        }

        bw.flush();
        bw.close();

    }
}
