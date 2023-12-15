package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class j11659 {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
//        int N = Integer.parseInt(stringTokenizer.nextToken());
//        int M = Integer.parseInt(stringTokenizer.nextToken());


        Scanner sc = new Scanner(System.in);
        int N,M = 0;


        N = sc.nextInt();
        M = sc.nextInt();

        long[] sum = new long[N];

        for(int i = 0; i < N; i++){
            int a = sc.nextInt();
            if (i>=1){
                sum[i] = sum[i-1] + a;
            }else{
                sum[i] = a;
            }
        }


        for(int i = 0; i < M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a==1){
                System.out.println(sum[b-1]);
            }else{
                System.out.println(sum[b-1] - sum[a-2]);
            }

        }
    }
}
