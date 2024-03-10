package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class j21736 {
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int N;
    static int M;
    static boolean[][] visited;
    static char[][] campus;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());


        campus = new char[N][M];
        visited = new boolean[N][M];
        int result = 0;

        for(int i=0;i<N;i++){
            String temp = br.readLine();
            char[] charArray = temp.toCharArray();
            for(int j=0;j<M;j++){
                campus[i][j] = charArray[j];
            }
        }

        for(int i=0;i<N;i++){
            for(int j=0; j<M; j++){
                if(!visited[i][j] && campus[i][j] == 'I'){
                    Node node = new Node(i,j);
                    result += bfs(node);
                }
            }
        }

        if(result == 0){
            System.out.println("TT");
        }else{
            System.out.println(result);
        }




    }

    private static int bfs(Node node){
        int cnt = 0;
        visited[node.i][node.j] = true;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);

        while(!queue.isEmpty()){
            Node temp = queue.poll();
            for(int i=0;i<4;i++){
                int a = temp.i + dx[i];
                int b = temp.j + dy[i];

                if(0<=a && a<N && 0<=b && b<M && !visited[a][b] && campus[a][b] != 'X'){
                    if(campus[a][b] == 'P'){
                        cnt +=1;
                    }
                    queue.add(new Node(a,b));
                    visited[a][b] = true;
                }
            }
        }

        return cnt;
    }

    static class Node{
        int i;
        int j;

        public Node(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}
