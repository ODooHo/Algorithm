package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class j12761 {
    static int[] bridge;
    static boolean[] visited;
    static int[] jump;
    static int[] move;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        move = new int[]{1, -1, A, -A, B, -B};
        jump = new int[]{A,B};

        bridge = new int[100001];
        visited = new boolean[100001];

        BFS(N,M);

    }
    private static void BFS(int start,int arrived){
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;

        queue.add(start);

        while(!queue.isEmpty()){
            int temp = queue.poll();
            for(int i =0; i<6;i++){
                int next = temp + move[i];
                if(next>=0 && next<100000 && !visited[next]){
                    visited[next] = true;
                    bridge[next] = bridge[temp] + 1;
                    queue.add(next);
                }
            }
            for(int i =0; i<2;i++){
                int next = temp * jump[i];
                if(next>=0 && next<100000 && !visited[next]){
                    visited[next] = true;
                    bridge[next] = bridge[temp] + 1;
                    queue.add(next);
                }
            }
            if(bridge[arrived]>0){
                break;
            }
        }
        System.out.println(bridge[arrived]);
    }
}
