package code;

import java.util.Scanner;

public class j1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] temp = new int[N];
        float result = 0;

        for (int i = 0; i < N; i++) {
            temp[i] = sc.nextInt();
            result += temp[i];
        }

        int max = temp[0];
        for (int i = 0; i < N; i++) {
            if (temp[i] > max) {
                max = temp[i];
            }
        }

        result = result * 100 / max / N;


        System.out.println(result);

    }
}
