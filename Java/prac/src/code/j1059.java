package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class j1059 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int[] S = new int[L];
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < L; i++) {
            S[i] = Integer.parseInt(st.nextToken());
        }
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int start = 0;
        int end = 0;
        Arrays.sort(S);
        for (int current : S) {
            if (current < n) {
                start = current;
            } else if (current > n){
                end = current;
                break;
            }else{
                System.out.println(0);
                return;
            }
        }

        for(int i = start +1 ; i <= n; i++){
            for(int j = n; j<= end -1 ; j++){
                if(i!=j){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
