package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j13986 {
    static int n;
    static int m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[]dx = {-1,1,0,0};
        int[]dy = {0,0,-1,1};
        int y = 1;
        char[][] map = new char[n][m];
        boolean[][] visited = new boolean[n][m];

        for(int i = 0; i < n; i++){
            String temp = br.readLine();
            for(int j = 0; j < m; j++){
                map[i][j] = temp.charAt(j);
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(map[i][j] == 'o' && !visited[i][j]){
                    dfs(map,i,j,visited);
                }
            }
        }

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }


    }

    private static void dfs(char[][] map, int x, int y, boolean[][] visited){
        int dx = x+1;
        if(dx < n && map[dx][y] == 'o'){
            dfs(map,dx,y,visited);
            if(map[dx][y] == '.'){
                map[x][y] = '.';
                map[dx][y] = 'o';
            }
        }
        else if(dx < n && map[dx][y] == '.'){
            map[dx][y] = 'o';
            map[x][y] = '.';
        }

    }
}
