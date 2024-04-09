package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j14888 {
    static int N;
    static int MAX = Integer.MIN_VALUE;
    static int MIN = Integer.MAX_VALUE;
    static int[] input;
    static int[] arr;
    static int[] expression;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        input = new int[N];
        arr = new int[N];
        visited = new boolean[N];
        expression = new int [4];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            input[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());

        for(int i=0;i<4;i++){
            expression[i] = Integer.parseInt(st.nextToken());
        }
        dfs(input[0],1);

        System.out.println(MAX);
        System.out.println(MIN);

    }
    static void dfs(int num, int depth){
        if(depth == N){
            MAX = Math.max(num,MAX);
            MIN = Math.min(num,MIN);
            return;
        }

        for(int i=0;i<4;i++){
            if(expression[i] >0){
                expression[i]--;
                if(i==0){
                    dfs(num + input[depth],depth+1);
                }
                else if(i==1){
                    dfs(num - input[depth],depth+1);
                }
                else if(i==2){
                    dfs(num * input[depth],depth+1);
                }
                else {
                    dfs(num / input[depth],depth+1);
                }
                expression[i]++;
            }

        }

    }
}
