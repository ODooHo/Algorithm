package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class j6118 {
    static boolean visited[];
    static ArrayList<Integer>[] D;
    static int distance;
    static int result[];
    static int n;
    static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        D = new ArrayList[n + 1];
        result = new int[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            D[i] = new ArrayList<>();
            visited[i] = false;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            D[a].add(b);
            D[b].add(a);
        }

        BFS(1);

        int max = 0;
        for (int i : result) {
            if (i > max) {
                max = i;
            }
        }

        int first = 0;
        int cnt = 0;

        boolean flag = false;

        for (int i = 1; i <= n; i++) {
            if (!flag && result[i] == max) {
                first = i;
                cnt++;
                flag = true;
            } else if (result[i] == max) {
                cnt++;
            }

        }

        System.out.println(first + " " + max + " " + cnt);

    }


    private static void BFS(int start) {
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (Integer next : D[current]) {
                if (!visited[next]) {
                    queue.add(next);
                    result[next] = result[current] + 1;
                    visited[next] = true;
                }
            }
        }
    }
}
