package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j14582 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = 0;
        int B = 0;

        int[] score_A = new int[9];
        int[] score_B = new int[9];

        for(int i=0;i<9;i++){
            score_A[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<9;i++){
            score_B[i] = Integer.parseInt(st.nextToken());
        }

        boolean flag = false;
        for(int i=0; i<9;i++){
            A += score_A[i];
            if(A>B){
                flag = true;
                System.out.println("Yes");
                break;
            }
            B += score_B[i];
        }
        if(!flag){
            System.out.println("No");
        }


    }
}
