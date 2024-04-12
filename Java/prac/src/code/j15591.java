package code;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class j15591 {
    static int N;
    static int Q;

    static ArrayList<Node>[] video;
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        Q = Integer.parseInt(st.nextToken());


        video = new ArrayList[N+1];
        for(int i=1;i<=N;i++){
            video[i] = new ArrayList<>();
        }

        for(int i=0; i<N-1;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            video[a].add(new Node(b,c));
            video[b].add(new Node(a,c));
        }

        for(int t=0; t<Q;t++) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            int result = bfs(k, v);
            bw.append(result + "\n");
        }

        bw.flush();
        bw.close();
    }

    static int bfs(int k, int v){
        int cnt = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        boolean[] visited = new boolean[N+1];
        visited[v] = true;

        while(!queue.isEmpty()){
            Integer current = queue.poll();
            ArrayList<Node> nodes = video[current];
            for (Node node : nodes) {
                if(!visited[node.idx] && node.value>=k){
                        cnt++;
                        queue.add(node.idx);
                        visited[node.idx] = true;
                    }
                }
            }
        return cnt;
    }



    static class Node{
        int idx;
        int value;

        public Node(int idx, int value) {
            this.idx = idx;
            this.value = value;
        }
    }
}
