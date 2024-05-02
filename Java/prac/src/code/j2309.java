package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeSet;

public class j2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] kids = new int[9];
        for (int i = 0; i < 9; i++) {
            kids[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(kids);

        int num = Arrays.stream(kids).sum();

        boolean flag = false;
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                int check = kids[i] + kids[j];
                if (num - check == 100) {
                    kids[i] = 999;
                    kids[j] = 999;
                    flag = true;
                    break;
                }
            }
            if (flag){
                break;
            }
        }

        Arrays.sort(kids);

        for (int i = 0; i < 7; i++) {
            System.out.println(kids[i]);
        }
    }
}
