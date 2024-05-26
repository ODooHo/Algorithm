package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j31263 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String temp = br.readLine();


        int cnt = 0;
        int i = temp.length();
        while (i > 0) {
            int size = 3;
            String check = temp.substring(Math.max(0, i - size), i);
            if (Integer.parseInt(check) > 641) {
                check = temp.substring(Math.max(0, i - size + 1), i);
                if (check.startsWith("0")) {
                    i -= 1;
                } else {
                    i -= 2;
                }
            } else {
                if (check.startsWith("0")) {
                    check = temp.substring(Math.max(0, i - size + 1), i);
                    if (check.startsWith("0")) {
                        i -= 1;
                    } else {
                        i -= 2;
                    }
                } else {
                    i -= 3;
                }
            }
            cnt += 1;

        }

        System.out.println(cnt);


        /**
         * 입력 값을 하나의 int요소들로 받던가. String으로 받아서 분리하는 작업이 필요함
         * 어차피 최대 3자리수고 만약 그 3자리수가 674 보다 낮으면 잘라서 cnt +1
         * 만약 크다면 맨 뒤에거 빼고 2자리 잘라서 cnt +1
         *
         */
    }
}
