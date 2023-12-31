package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class j4485 {
    static int[][] cave;
    static int[][] dist;
    static boolean[][] visited;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};

    static class Node{
        int x;
        int y;
        int cost;

        public Node(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int cnt = 1;
        while(true){
            int T = Integer.parseInt(br.readLine());
            if(T == 0){
                break;
            }
            cave = new int[T][T];
            visited = new boolean[T][T];
            dist = new int[T][T];

            for(int i=0;i<T;i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0;j<T;j++){
                    int a = Integer.parseInt(st.nextToken());
                    cave[i][j] = a;
                    dist[i][j] = Integer.MAX_VALUE;
                }
            }
            Dijkstra(T,0,0);

            System.out.println("Problem " + cnt + ": " + dist[T-1][T-1]);
            cnt++;
        }
    }

    private static void Dijkstra(int T, int i, int j) {
        PriorityQueue<Node> queue = new PriorityQueue<>((Comparator.comparingInt(o -> o.cost)));
        queue.offer(new Node(i,j,cave[i][j]));
        visited[i][j] = true;
        dist[i][j] = cave[i][j];
        while(!queue.isEmpty()){
            Node now = queue.poll();
            for(int k=0; k<4;k++){  //4방향 탐색
                int x = now.x + dx[k];
                int y = now.y + dy[k];
                if(x>=0 && y>=0 && x<T && y<T){
                    if(now.cost + cave[x][y] < dist[x][y] &&!visited[x][y]){
                        dist[x][y] = now.cost + cave[x][y];
                        visited[x][y] = true;
                        queue.add(new Node(x,y,now.cost + cave[x][y]));
                    }
                }
            }
        }
    }


}
