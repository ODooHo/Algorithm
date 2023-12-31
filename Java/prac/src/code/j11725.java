package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class j11725 {
    static ArrayList<Integer>[] tree;
    static boolean[] visited;
    static int[] result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        tree = new ArrayList[N+1];
        result = new int[N+1];
        visited = new boolean[N+1];

        for(int i=1;i<=N;i++){
            tree[i] = new ArrayList<>();
        }

        for(int i=1;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            tree[a].add(b);
            tree[b].add(a);
        }
        DFS(1);

        for(int i=2;i<=N;i++){
            System.out.println(result[i]);
        }
    }

    private static void DFS(int i) {
        visited[i] = true;
        for (Integer temp : tree[i]) {
            if(!visited[temp]){
                result[temp] = i;
                DFS(temp);
            }
        }
    }
}
