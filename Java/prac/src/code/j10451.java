package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class j10451 {
    static boolean visited[];
    static ArrayList<Integer>[] num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        for (int x = 0; x < t; x++) {
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;
            num = new ArrayList[n + 1];
            visited = new boolean[n + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                num[i] = new ArrayList<>();
            }

            for (int i = 1; i <= n; i++) {
                int temp = Integer.parseInt(st.nextToken());
                num[i].add(temp);
                num[temp].add(i);
            }

            for (int i = 1; i <= n; i++) {
                if (!visited[i]) {
                    search(i);
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }

    private static void search(int start) {
        visited[start] = true;

        for (Integer next : num[start]) {
            if (!visited[next]) {
                search(next);
            }
        }
    }
}
