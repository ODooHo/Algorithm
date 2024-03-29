

package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class j14503 {
    static int N;
    static int M;
    static int[][] room;
    static int cnt = 1;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        room = new int[N][M];

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                room[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        clean(r, c, d);
        System.out.println(cnt);

    }

    static void clean(int i, int j, int d) {
        room[i][j] = -1;


        for (int t = 0; t < 4; t++) {
            d = (d+3)%4;
            int nx = i + dx[d];
            int ny = j + dy[d];
            if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                if (room[nx][ny] == 0) {
                    cnt++;
                    clean(nx, ny, d);
                    return;
                }
            }
        }

        int back = (d + 2) % 4; //반대 방향으로 후진
        int bx = i + dx[back];
        int by = j + dy[back];
        if (bx >= 0 && by >= 0 && bx < N && by < M && room[bx][by] != 1) {
            clean(bx, by, d);
        }


    }

}

