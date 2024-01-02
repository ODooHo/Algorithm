package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class practice {

    static class Node{
        int v; //엣지
        int cost; //비용

        public Node(int v, int cost) {
            this.v = v;
            this.cost = cost;
        }
    }
    static boolean[] visited;
    static ArrayList<Node>[] D;
    static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int v = Integer.parseInt(st.nextToken()); //노드 갯수
        int e = Integer.parseInt(st.nextToken()); //간선 갯수
        int k = Integer.parseInt(st.nextToken()); //시작점


        D = new ArrayList[v+1];
        visited = new boolean[v+1];
        result = new int[v+1];


        for(int i=1;i<=v;i++){
            D[i] = new ArrayList<>();
            result[i] = Integer.MAX_VALUE;
            visited[i] = false;
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

    private static void Dijkstra(int start){
        PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(o-> o.cost));

        queue.add(new Node(start,0));
        result[start] = 0;
        while(!queue.isEmpty()){
            Node current = queue.poll();

            if(!visited[current.v]){
                visited[current.v] = true;
            }

            for (Node next: D[current.v]) {
                if(!visited[next.v] && result[next.v] > current.cost + next.cost){
                    result[next.v] = current.cost + next.cost;
                    queue.add(new Node(next.v,result[next.v]));
                 }
            }
        }
    }
}
