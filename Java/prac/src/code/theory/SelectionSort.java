package code.theory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SelectionSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] list = new int[10];
        for (int i = 0; i < 10; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        int idx = 0;

        for (int i = 0; i < 10; i++) {
            int min = list[i];
            for (int j = i + 1; j < 10; j++) {
                if (list[j] < min) {
                    min = list[j];
                    idx = j;
                }
            }
            if (i != 9) {
                list[idx] = list[i];
                list[i] = min;
            }

        }

        for (int i = 0; i < 10; i++) {
            System.out.print(list[i]);
        }
    }
}
