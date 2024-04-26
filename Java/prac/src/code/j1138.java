package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class j1138 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] line = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            line[i] = Integer.parseInt(st.nextToken());
        }
        List<Integer> result = new ArrayList<>();

        for (int i = n; i >= 1; i--) {
            result.add(line[i], i);
        }

        for (Integer res : result) {
            System.out.print(res + " ");
        }
    }
}
