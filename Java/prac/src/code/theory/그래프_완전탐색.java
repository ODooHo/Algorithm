package code.theory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 그래프_완전탐색 {
    static boolean visited[];
    static ArrayList<Integer>[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        visited = new boolean[n + 1];

        A = new ArrayList[n + 1];

        for (int i = 1; i < n + 1; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }

        for (int i = 1; i < A.length; i++) {
            System.out.print(i + " -> ");
            for (int j : A[i]) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


        DFS(v);
        BFS(v);

    }

    private static void DFS(int v) {
        if (visited[v]) {
            return;
        }
        visited[v] = true;
        if (v != 0) {
            System.out.print(v);
        }
        for (int i : A[v]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }

    private static void BFS(int i) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(i);
        visited[i] = true;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (Integer temp : A[current]) {
                if (!visited[temp]) {
                    queue.offer(temp);
                    visited[temp] = true;
                }
            }
        }

    }
}
