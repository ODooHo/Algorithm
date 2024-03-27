package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class j11048 {
    static int N;
    static int M;
    static int[][] maze;
    static int[][] result;
    static int[] dx = {1,0,1};
    static int[] dy = {0,1,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        maze = new int[N+1][M+1];
        result = new int[N+1][M+1];


        for(int i=1; i<=N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=M;j++){
                int candy = Integer.parseInt(st.nextToken());
                maze[i][j] = candy;
            }
        }

        result[0][0] = maze[0][0];

        for(int i=1; i<=N;i++){
            for(int j=1;j<=M;j++){
                result[i][j] = Math.max(maze[i][j] + result[i-1][j], maze[i][j] + result[i][j-1]);
            }
        }

        System.out.println(result[N][M]);

    }


}
