package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int[] alpha = new int[26];

        for(int i=0; i<input.length(); i++) {
            int idx = input.charAt(i)-'A';
            alpha[idx]++;
        }

        int check = 0;
        for (int value : alpha) {
            if (value % 2 != 0) {
                check++;
            }
        }

        String answer = "";
        StringBuilder sb = new StringBuilder();
        if (check > 1) {
            answer += "I'm Sorry Hansoo";
        }else{
            for(int i=0; i<alpha.length; i++) {
                for (int j = 0; j < alpha[i] / 2; j++) {
                    sb.append((char)( i + 'A'));
                }
            }

                answer+=sb.toString();
                String end = sb.reverse().toString();

                sb = new StringBuilder();
                for(int k=0; k<alpha.length; k++){
                    if(alpha[k]%2==1){
                        sb.append((char)(k+'A'));
                    }
                }
                answer += sb.toString() + end;
        }
        System.out.println(answer);
    }
}
