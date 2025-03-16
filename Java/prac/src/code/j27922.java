package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class j27922 {
    static int N;
    static int K;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        List<Integer> course12 = new ArrayList<>();
        List<Integer> course13 = new ArrayList<>();
        List<Integer> course23 = new ArrayList<>();


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            course12.add(a+b);
            course13.add(a+c);
            course23.add(b+c);
        }


        course12.sort(Collections.reverseOrder());
        course13.sort(Collections.reverseOrder());
        course23.sort(Collections.reverseOrder());

        int maxA = 0;
        int maxB = 0;
        int maxC = 0;
        for(int i = 0; i < K; i++){
            maxA += course12.get(i);
            maxB += course13.get(i);
            maxC += course23.get(i);
        }

        System.out.println(Math.max(maxA,Math.max(maxB,maxC)));

    }

}

