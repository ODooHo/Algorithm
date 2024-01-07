package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j10026 {
    static char[][] basic;
    static char[][] weak;
    static boolean[][] visited_b;
    static boolean[][] visited_w;
    static int n;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        basic = new char[n][n];
        weak = new char[n][n];
        visited_b =new boolean[n][n];
        visited_w =new boolean[n][n];

        for(int i=0;i<n;i++){
            String temp = br.readLine();
            basic[i] = temp.toCharArray();
            weak[i] = temp.toCharArray();
        }
        int cnt_b = 0;

        for(int i = 0;i<n;i++){
            for(int j=0; j<n;j++){
                if(weak[i][j] == 'G'){
                    weak[i][j] = 'R';
                }
                if(!visited_b[i][j]){
                    DFS_b(i,j);
                    cnt_b++;
                }
            }
        }

        int cnt_w = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!visited_w[i][j]){
                    DFS_w(i,j);
                    cnt_w++;
                }
            }
        }

        System.out.println(cnt_b + " " + cnt_w);

    }

    private static void DFS_b(int i,int j){
        if(visited_b[i][j]){
            return;
        }
        visited_b[i][j] = true;

        for(int k=0;k<4;k++){
            int x = i + dx[k];
            int y = j + dy[k];
            if(x>=0 && y>=0 && x<n && y <n) {
                if (!visited_b[x][y] && basic[i][j] == basic[x][y]) {
                    DFS_b(x, y);
                }
            }
        }
    }

    private static void DFS_w(int i,int j){
        if(visited_w[i][j]){
            return;
        }
        visited_w[i][j] = true;

        for(int k=0;k<4;k++){
            int x = i + dx[k];
            int y = j + dy[k];
            if(x>=0 && y>=0 && x<n && y <n) {
                if (!visited_w[x][y] && weak[i][j] == weak[x][y]) {
                    DFS_w(x, y);
                }
            }
        }
    }
}
