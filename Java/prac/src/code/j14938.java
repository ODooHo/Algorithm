package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class j14938 {

    static class Node{
        int v;
        int cost;
        public Node(int v, int cost) {
            this.v = v;
            this.cost = cost;
        }

    }


    static ArrayList<Node>[] D;
    static int[] items;
    static int n;
    static int m;
    static int r;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        D = new ArrayList[n+1];


        for(int i=1;i<=n;i++){
            D[i] = new ArrayList<>();
        }

        items = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            items[i] = Integer.parseInt(st.nextToken());

        }


        for(int i=0;i<r;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            Node node1 = new Node(b,c);
            Node node2 = new Node(a,c);
            D[a].add(node1);
            D[b].add(node2);
        }
        int[] answer = new int[n+1];
        for(int i=1; i<=n;i++){
            int y = Dijkstra(i);
            answer[i] = y;
        }

        Arrays.sort(answer);


        System.out.println(answer[n]);
    }
    private static int Dijkstra(int start) {
        PriorityQueue<Node> queue = new PriorityQueue<>((Comparator.comparingInt(o -> o.cost)));
        //시작 노드 초기화
        queue.add(new Node(start,0));
        int [] result = new int[n+1];
        boolean []visited = new boolean[n+1];

        for(int i=1;i<=n;i++){
            result[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }
        result[start] = 0;
        int max = 0;
        while(!queue.isEmpty()){
            //현재 최단 거리가 가장 짧은 노드를 꺼내서 방문처리
            Node current = queue.poll();

            if(!visited[current.v]){
                visited[current.v] = true;
            }

            for (Node node : D[current.v]) {
                //방문하지 않았고, 현재 노드를 거쳐서 다른 노드로 가는 거리가 더 짧을 경우
                if(!visited[node.v] && result[node.v] > current.cost + node.cost){
                    result[node.v] = current.cost + node.cost;
                    queue.add(new Node(node.v,result[node.v]));
                }
            }
        }



        for(int i=1; i<=n; i++){
            if(result[i]<=m){
                max += items[i];
            }
        }


        return max;
    }


}
