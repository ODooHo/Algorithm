package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class j31287 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        char[] temp = br.readLine().toCharArray();
        int x = 0;
        int y = 0;

        boolean flag = false;
        String result = "NO";

        for (int i = 0; i < K; i++) {
            for (char current : temp) {
                switch (current){
                    case 'U':
                        x++; // x 증가
                        break;
                    case 'R':
                        y++; // y 증가
                        break;
                    case 'L':
                        y--; // y 감소
                        break;
                    case 'D':
                        x--; // x 감소
                        break;
                }
                if(x == 0 && y == 0){
                    result = "YES";
                    System.out.print(result);
                    return;
                }
            }
        }
        System.out.print(result);
    }
}
