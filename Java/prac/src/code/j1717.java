package code;

import java.io.*;
import java.util.StringTokenizer;

public class j1717 {
    static int[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        A = new int[n+1];

        for(int i=1;i<=n;i++){
            A[i] = i;
        }

        int method = 0;
        int a=0;
        int b=0;

        for(int j=0;j<m;j++){
            st = new StringTokenizer(br.readLine());
            method = Integer.parseInt(st.nextToken());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if(method == 0){
                union(a,b);
            }else{
                boolean flag = check(a,b);
                if(flag){
                    sb.append("YES\n");
                }else{
                    sb.append("NO\n");
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static void union(int a, int b) {
        if(b<a){
            int temp = b;
            b = a;
            a = temp;
        }
        a = find(a);
        b = find(b);
        if(a!=b){
            A[b] = a;
        }
    }


    private static int find(int a){
        if(a == A[a]){
            return a;
        }else{
            return A[a] = find(A[a]);
        }
    }


    private static boolean check(int a, int b) {
        a = find(a);
        b = find(b);

        if(a == b) {
            return true;
        }else{
            return false;
        }
    }
}
