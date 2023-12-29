package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class j1929 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int m = Integer.parseInt(st.nextToken());
//        int n = Integer.parseInt(st.nextToken());
//        int[] temp = new int[n+1];
//        for(int i=1;i<=n;i++){
//            temp[i] = i;
//        }
//
//
//        /**
//         * N의 제곱근까지만 탐색하는 것이 핵심
//         * N = axb라고 가정했을 때, a,b모두 N의 제곱근보다 클 수 없기 때문에.
//         */
//
//
//
//        for(int i=2;i<Math.sqrt(n);i++) {
//            if(temp[i] != -1){
//                for(int j=i+i; j<=n; j=j+i){
//                    temp[j] = -1;
//                }
//            }
//        }
//
//        temp[0] = -1;
//
//        for(int i=m; i<=n; i++){
//            if(temp[i] != -1){
//                System.out.println(temp[i]);
//            }
//        }
//
//
//    }
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int m = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());

    boolean[] isPrime = new boolean[n + 1];
    isPrime[0] = isPrime[1] = false;
        for (int i = 2; i <= n; i++) {
        isPrime[i] = true;
    }

        for (int i = 2; i * i <= n; i++) {
        if (isPrime[i]) {
            for (int j = i * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }
    }

        for (int i = m; i <= n; i++) {
        if (isPrime[i]) {
            System.out.println(i);
        }
    }
}
}
