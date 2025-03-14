package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class j2596 {
    static Map<String, Character> letter = new HashMap<>();

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String str = br.readLine();

        List<String> split = new ArrayList<>();

        for (int i = 0; i < str.length(); i += 6) {
            split.add(str.substring(i, i + 6));
        }

        String[] num = new String[]{"000000", "001111", "010011", "011100", "100110", "101001", "110101", "111010"};

        letter.put(num[0], 'A');
        letter.put(num[1], 'B');
        letter.put(num[2], 'C');
        letter.put(num[3], 'D');
        letter.put(num[4], 'E');
        letter.put(num[5], 'F');
        letter.put(num[6], 'G');
        letter.put(num[7], 'H');

        for (int t = 0; t < N; t++) {
            String inputString = split.get(t);
            boolean flag = false;
            for (String code : num) {
                if (inputString.equals(code)) {
                    sb.append(letter.get(code));
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                int[] count = new int[8];
                int idx = 0;
                for (String code : num) {
                    int cnt = 0;
                    for (int i = 0; i < code.length(); i++) {
                        if (inputString.charAt(i) != code.charAt(i)) {
                            cnt++;
                        }
                    }
                    count[idx++] = cnt;
                }
                int min = count[0];
                int tmp = 0;
                for (int i = 0; i < count.length; i++) {
                    if (count[i] < min) {
                        tmp = i;
                        min = count[i];
                    }
                }
                if (min >= 2) {
                    System.out.println(t + 1);
                    return;
                } else {
                    sb.append(letter.get(num[tmp]));
                }

            }
        }
        System.out.println(sb);
    }


}
