package code;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class j15657 {
    static int N;
    static int M;
    static int[] input;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        input = new int[N];
        arr = new int[M];

        st = new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++){
            input[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(input);
        dfs(0);

        bw.append(sb.toString());
        bw.flush();
        bw.close();
    }

    static void dfs(int depth){
        if(depth == M){
            for(int k = 0; k<M-1;k++){
                if(arr[k] > arr[k+1]){
                    return;
                }
            }
            for (int i : arr) {
                sb.append(i + " ");
            }
            sb.append("\n");
            return;
        }

        for(int i=0;i<N;i++){
            arr[depth] = input[i];
            dfs(depth+1);
        }
    }
}
