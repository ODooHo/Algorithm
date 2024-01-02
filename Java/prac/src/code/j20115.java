package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class j20115 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Double[] num = new Double[n];
        st = new StringTokenizer(br.readLine());
        double max = 0;
        for(int i=0; i<n;i++){
            num[i] = Double.valueOf(st.nextToken());
            if(num[i]>max){
                max = num[i];
            }
        }
        double result = max;

        for(int i= 0;i<n;i++){
            if(num[i] ==max ){
                continue;
            }
            result += num[i]/2;
        }

        System.out.println(result);
    }
}
