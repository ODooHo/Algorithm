package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class j3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] list = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            list[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(list);
        int x = Integer.parseInt(br.readLine());

        int start = 0;
        int end = n-1;
        int cnt = 0;

        while(start<end){
            int check = list[start] + list[end];

            if(check < x){
                start++;
            }
            else if(check>x){
                end--;
            }
            else{
                cnt++;
                start++;
                end--;
            }
        }

        System.out.println(cnt);
    }
}
