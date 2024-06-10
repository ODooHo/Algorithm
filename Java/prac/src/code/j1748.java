package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int s = Integer.parseInt(br.readLine());

        int plus = 1;
        int cnt = 0;

        int standard = 10;

        for(int i=1; i<=s; i++){
            if(i % standard == 0){
                standard *= 10;
                plus++;
            }

            cnt+=plus;
        }

        System.out.println(cnt);
    }
}
