package code;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class j15650 {
    static int[] arr;
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];

        dfs(1,0);



        bw.append(sb.toString());
        bw.flush();
        bw.close();

    }

    static void dfs(int at, int depth){
        if(depth == M){
            for (int i : arr) {
                sb.append(i + " ");
            }
            sb.append("\n");
            return;
        }


        for(int i=at; i<=N; i++){
                arr[depth] = i;
                dfs(i+1,depth+1);

        }
    }

}
