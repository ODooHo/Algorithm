package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class j2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int [] list = new int[n];


        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            int temp = Integer.parseInt(st.nextToken());
            list[i] = temp;
        }

        int start = 0;
        int end = 0;

        int cnt = 0;
        int sum = 0;



        while(true){
            if(sum>=m){
                sum -= list[start];
                start++;
            }else if(end == n){
                break;
            }
            else{
                sum += list[end];
                end++;
            }
            if (sum == m){
                cnt++;
            }
        }

        System.out.println(cnt);

    }



}
