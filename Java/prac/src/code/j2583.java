package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class j2583 {
    static boolean visited[][];
    static int area[][];

    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int n;
    static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> result = new ArrayList<>();

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        visited = new boolean[n+1][m+1];
        area = new int[n+1][m+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                area[i][j] = 0;
            }
        }


        for(int i=0;i<k;i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            x1++;
            y1++;
            for(int y=y1;y<=y2;y++){
                for(int x=x1;x<=x2;x++){
                    area[x][y] = 1;
                }
            }
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(area[i][j] == 0){
                    int temp = BFS(i,j);
                    result.add(temp);
                }
            }

        }

        System.out.println(result.size());
        for (Integer answer : result) {
            System.out.print(answer + " ");
        }
    }

    private static int BFS(int i, int j){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        visited[i][j] = true;
        int width = 1;
        while(!queue.isEmpty()){
            int[] current = queue.poll();

            for(int k=0;k<4;k++){
                int x = current[0] + dx[k];
                int y = current[1] + dy[k];

                if(!visited[x][y] && x>=0 && y>=0 && x<n && y<m){
                    if(area[x][y] != 1){
                        visited[x][y] = true;
                        queue.add(new int[]{x,y});
                        width++;
                    }
                }
            }
        }
        return width;
    }

}
