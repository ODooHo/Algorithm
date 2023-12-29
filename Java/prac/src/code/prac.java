package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class prac {
    static boolean[] visited;
    static ArrayList<Integer>[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        A = new ArrayList[n+1];
        visited = new boolean[n+1];

        for(int i=1; i<=n; i++){
            A[i] = new ArrayList<>();
        }
        for(int i=0; i<m;i++){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            A[a].add(b);
            A[b].add(a);
        }

        for(int i=1;i<=n;i++){
            Collections.sort(A[i]);
        }

        DFS(v);
        System.out.println();
        visited = new boolean[n+1];
        BFS(v);



    }

    private static void DFS(int v) {
        if(visited[v]){
            return;
        }
        visited[v] = true;
        System.out.print(v + " ");
        for (Integer node : A[v]) {
            if(!visited[node]){
                DFS(node);
            }
        }
    }

    private static void BFS(int v){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        visited[v] = true;

        while(!queue.isEmpty()){
            int a = queue.poll();
            System.out.print(a + " ");
            for (Integer i : A[a]) {
                if(!visited[i]){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }

    }
}
