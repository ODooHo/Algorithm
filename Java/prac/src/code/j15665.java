package code;

import java.io.*;
import java.util.*;

public class j15665 {
    static int N;
    static int M;
    static int[] arr;
    static boolean[] visited;
    static int[] input;

    static Set<String> result = new LinkedHashSet<>();

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<Integer> temp = new HashSet<>();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());


        visited = new boolean[N];
        arr = new int[M];
        input = new int[N];

        for (int i = 0; i < N; i++) {
            input[i] = 100001;
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(input);

        dfs(0);

        for (String s : result) {
            System.out.println(s);
        }

    }

    static void dfs(int depth) {
        if (depth == M) {
            sb = new StringBuilder();
            for (int i : arr) {
                sb.append(i + " ");
            }
            String s = sb.toString();
            result.add(s);
            return;
        }
        for (int i = 0; i < N; i++) {
            if (input[i] > 10001) {
                return;
            }
            visited[i] = true;
            arr[depth] = input[i];
            dfs(depth + 1);

        }

    }
}
