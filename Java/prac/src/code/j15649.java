package code;

import java.io.*;
import java.util.StringTokenizer;

public class j15649 {
    static boolean[] visited;
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

        visited = new boolean[N];
        arr = new int[M];

        dfs(0);

        bw.append(sb.toString());
        bw.flush();
        bw.close();

    }

    static void dfs(int depth){
        if(depth == M){
            for (int i : arr) {
                sb.append(i + " ");
            }
            sb.append("\n");
            return;
        }


        for(int i=0; i<N; i++){
            if(!visited[i]){

                visited[i] = true;
                arr[depth] = i+1;
                dfs(depth+1);

                visited[i] = false;
            }
        }
    }

}
