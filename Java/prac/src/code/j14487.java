package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j14487 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] island = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            island[i] = Integer.parseInt(st.nextToken());
        }
        int max = 0;
        int result = 0;

        for (int i : island) {
            if(i>max){
                max = i;
            }
            result+=i;
        }

        System.out.println(result-max);
    }
}
