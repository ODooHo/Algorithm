package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class j12101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        ArrayList<String>[] dp = new ArrayList[11];
        for(int i=0;i<11;i++){
            dp[i] = new ArrayList<>();
        }

        dp[1].add("1");
        dp[2].add("1+1");
        dp[2].add("2");
        dp[3].add("1+2");
        dp[3].add("1+1+1");
        dp[3].add("2+1");
        dp[3].add("3");

        for(int i=4;i<n+1;i++){
            for(int j=1;j<4;j++){
                for (String temp : dp[i - j]) {
                    dp[i].add(temp + "+" + j);
                }
            }
        }

        if(dp[n].size() <k){
            System.out.println(-1);
        }
        else{
            Collections.sort(dp[n]);

            System.out.println(dp[n].get(k-1));
        }

    }
}
