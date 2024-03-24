package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class j1707 {
    static ArrayList<Integer>[] A;
    static int[] check;
    static boolean[] visited;
    static boolean isEven;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());




        for(int x = 0; x <n; x++){
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            A = new ArrayList[v+1];
            visited = new boolean[v+1];
            check = new int[v+1];
            isEven = true;

            for(int i=1;i<=v; i++){
                A[i] = new ArrayList<>();
            }

            for(int i=0;i<e;i++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                A[a].add(b);
                A[b].add(a);
            }

            for(int i=1; i<=v; i++){
                if(isEven){
                    DFS(i);
                }else{
                    break;
                }

            }
            if(isEven){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

    private static void DFS(int v) {
        visited[v] = true;
        for(int i : A[v]){ //인접 리스트로 받아서 start에서 연결된 모든 노드를 탑색
            if(!visited[i]){
                // 직전 노드와 다른 집합으로 분류
                check[i] = (check[v] + 1) %2; //토글 1,0 집합 스위치
                DFS(i);
            }else if(check[v] == check[i]){
                    isEven = false;
            }
        }
    }
}
