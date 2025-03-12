package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j6178 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[][] stomp = new int[R+1][C+1];

        stomp[0][0] = -1;

        for(int i = 1; i <= R; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= C; j++){
                stomp[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int t = 0; t < N; t++){
            st = new StringTokenizer(br.readLine());
            int rs = Integer.parseInt(st.nextToken());
            int cs = Integer.parseInt(st.nextToken());
            int ds = Integer.parseInt(st.nextToken());

            //3x3 탐색하며 최대값 찾기
            int max = stomp[rs][cs];

            for(int r = rs; r < rs+3; r++){
                for(int c = cs; c < cs+3; c++){
                    if(stomp[r][c] > max){
                        max = stomp[r][c];
                    }

                }
            }

            int dig = max - ds;

            for(int r = rs; r < rs+3; r++){
                for(int c = cs; c < cs+3; c++){
                    if(stomp[r][c] > dig){
                        stomp[r][c] = dig;
                    }
                }
            }
        }
        int total = 0;
        for(int i = 1; i <= R; i++){
            for(int j = 1; j <= C; j++){
                int temp = stomp[i][j] - E;
                if(temp > 0){
                    stomp[i][j] = 0;
                }else{
                    stomp[i][j] = Math.abs(temp);
                    total += stomp[i][j];
                }
            }
        }
        System.out.println(total * 72 * 72);
    }
}
