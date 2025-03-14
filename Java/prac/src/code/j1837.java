package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class j1837 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger P = new BigInteger(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for(int i = 2; i < K; i++){
            if(P.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)){
                System.out.println("BAD " + i);
                return;
            }
        }
        System.out.println("GOOD");

    }
}
