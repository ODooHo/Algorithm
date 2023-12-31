package code.theory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 최단거리 {

    static class Node{
        int v;
        int cost;

        public Node(int v, int cost) {
            this.v = v;
            this.cost = cost;
        }

    }
    static ArrayList<Node>[] D;
    static boolean[] visited;

    static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int v = Integer.parseInt(st.nextToken()); //노드 갯수
        int e = Integer.parseInt(st.nextToken()); //간선 갯수
        int k = Integer.parseInt(st.nextToken()); //시작점


        D = new ArrayList[v+1];
        result = new int[v+1];


        for(int i=1;i<=v;i++){
            D[i] = new ArrayList<>();
            result[i] = Integer.MAX_VALUE;
        }



        for(int i=0;i<e;i++){  //간선 갯수만큼
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());;
            int b = Integer.parseInt(st.nextToken());;
            int c = Integer.parseInt(st.nextToken());;
            Node node = new Node(b,c);
            D[a].add(node);
        }

        Dijkstra(k);


        for(int i=1; i<=v;i++){
            if(result[i] == Integer.MAX_VALUE){
                System.out.println("INF");
            }else{
                System.out.println(result[i]);
            }

        }


    }

    private static void Dijkstra(int start) {
        PriorityQueue<Node> queue = new PriorityQueue<>(((o1, o2) -> o1.cost - o2.cost));
        //시작 노드 초기화
        queue.add(new Node(start,0));
        result[start] = 0;

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
    }
}
