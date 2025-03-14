package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] x1 = new int[2];
        int[] x2 = new int[2];
        int[] x3 = new int[2];

        st = new StringTokenizer(br.readLine());
        x1[0] = Integer.parseInt(st.nextToken());
        x1[1] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        x2[0] = Integer.parseInt(st.nextToken());
        x2[1] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        x3[0] = Integer.parseInt(st.nextToken());
        x3[1] = Integer.parseInt(st.nextToken());

        int[] x4 = new int[2];

        for (int i = 0; i < 2; i++) {
            if(x1[i] == x2[i]){
                x4[i] = x3[i];
            }else if(x1[i] == x3[i]){
                x4[i] = x2[i];
            }else{
                x4[i] = x1[i];
            }
        }
        System.out.println(x4[0] + " " + x4[1]);

    }
}
