package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class j2607 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String first = br.readLine();
        int result = 0;

        for (int i = 0; i < N - 1; i++) {
            String temp = br.readLine();
            int cnt = 0;
            int[] word = new int[26];
            for (int j = 0; j < first.length(); j++) {
                word[first.charAt(j) - 'A']++;
            }

            for (int j = 0; j < temp.length(); j++) {
                if (word[temp.charAt(j) - 'A'] > 0) {
                    cnt++;
                    word[temp.charAt(j) - 'A']--;
                }
            }

            // 기준 문자열 길이와 비교 문자열 길이 차이
            // 같은 경우 or 한 글자만 바뀐경우
            if (first.length() == temp.length() && (first.length() == cnt || first.length() - 1 == cnt)) {
                result++;
            }
            // 비교 문자열이 짧은 경우 (제거)
            else if (first.length() == temp.length() - 1 && temp.length() - 1 == cnt) {
                result++;
            }
            // 비교 문자열이 긴 경우 (추가)
            else if (first.length() == temp.length() + 1 && temp.length() == cnt) {
                result++;
            }

        }
        System.out.println(result);
    }
}
