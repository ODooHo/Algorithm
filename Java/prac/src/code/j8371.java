package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j8371 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        char[] correctAnswer = br.readLine().toCharArray();
        char[] answer = br.readLine().toCharArray();

        int cnt = 0;
        for(int i = 0; i<N; i++){
            if(correctAnswer[i] != answer[i]){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
