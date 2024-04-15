package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j1182 {
    static int N;
    static int S;
    static int[] num;
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        num = new int[N];

        dfs(0,0);
        if(S == 0){
            System.out.println(cnt-1);
        }else{
            System.out.println(cnt);
        }

    }
    static void dfs(int depth, int sum){
        if(depth == N){
            if(sum == S){
                cnt++;
            }
            return;
        }

        dfs(depth+1,sum + num[depth]);
        dfs(depth+1,sum);
    }
}
