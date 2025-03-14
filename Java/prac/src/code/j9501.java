package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j9501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        StringTokenizer st;
        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            int cnt = 0; // 목적지까지 갈 수 있는 우주선 개수
            int n = Integer.parseInt(st.nextToken()); // 우주선 개수
            int d = Integer.parseInt(st.nextToken()); // 목적지까지 거리

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int v = Integer.parseInt(st.nextToken()); // 최고 속도
                int f = Integer.parseInt(st.nextToken()); // 연료량
                int c = Integer.parseInt(st.nextToken()); // 연료 소비율

                // 가능한 최대 거리 계산 (연료량 / 연료 소비율) * 속도
                double maxDistance = ((double) f / c) * v;

                if (maxDistance >= d) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
