package code;

import java.io.*;
import java.util.StringTokenizer;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] A = new int[N];
        int[] S = new int[N];

        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        S[0] = A[0];

        for(int i=1; i<N; i++){
            S[i] = S[i-1] + A[i];
        }

        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int f = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());

            if(f == s){
                bw.append(A[f-1] + "\n");
            }
            else if (f == 1){
                bw.append(S[s-1] + "\n");
            }
            else{
                int temp =  S[s-1] - S[f-2];

                bw.append(temp + "\n");
            }
        }

        bw.flush();
        bw.close();


    }

}