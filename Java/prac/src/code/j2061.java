package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class j2061 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger K = new BigInteger(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int smallestFactor = -1; // 가장 작은 인수를 저장할 변수

        // 2부터 L-1까지 검사
        for (int i = 2; i < L; i++) {
            if (K.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
                smallestFactor = i;
                break; // 가장 작은 인수를 찾으면 종료
            }
        }

        if (smallestFactor == -1) {
            System.out.println("GOOD"); // L 이상의 인수만 존재
        } else {
            System.out.println("BAD " + smallestFactor); // L 미만의 인수가 존재
        }
    }
}
