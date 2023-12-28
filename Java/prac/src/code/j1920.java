package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class j1920 {
    static int N;
    static int[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        check = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N; i++){
            check[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(check);

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            int a = Integer.parseInt(st.nextToken());
            System.out.println(bs(a));
        }
    }

    private static int bs(int a) {
        int result = 0;
        int start = 0;
        int end = N-1;
        int medium = 0;
        int temp = 0;
        while(start<=end){
            medium = (start + end)/2;
            temp = check[medium];
            if(a < temp){
                end = medium-1;
            }
            else if(a>temp){
                start = medium+1;
            }
            else{
                result = 1;
                return result;
            }
        }
        result = 0;
        return result;
    }
}
