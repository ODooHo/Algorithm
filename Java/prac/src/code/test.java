package code;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int [] source = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            source[i] = Integer.parseInt(st.nextToken());
        }


        Arrays.sort(source);
        int max = source[N-1];


        int start = 0;
        int end = N-1;
        int cnt = 0;

        while(start < end){
            int temp = source[start] + source[end];
            if(temp == M){
                cnt++;
                start++;
                end--;
            }else if(temp < M){
                start++;
            }else{
                end--;
            }
        }

        System.out.println(cnt);


    }

}