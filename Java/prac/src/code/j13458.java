package code;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j13458 {
    static int N;
    static long[] A;
    static long B;
    static long C;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        A = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            A[i] = Long.parseLong(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        B = Long.parseLong((st.nextToken()));
        C = Long.parseLong((st.nextToken()));

        long cnt = 0;
        for (long temp : A) {
            temp = temp - B;
            cnt++;
            if(temp > 0){
                long share = temp / C;
                long remainder = temp % C;
                cnt+=share;
                if(remainder != 0){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
