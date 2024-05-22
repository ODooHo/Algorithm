package code;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class j15651 {
    static boolean[] visited;
    static int[] arr;
    static int[] num;
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
        num = new int[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);

        dfs(0);

        bw.append(sb.toString());
        bw.flush();
        bw.close();

    }

    static void dfs(int depth) {
        if (depth == M) {

            for (int i : arr) {
                sb.append(i + " ");
            }
            sb.append("\n");
            return;
        }


        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = num[i];
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}
