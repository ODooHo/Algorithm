package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class j1448 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        Integer[] num = new Integer[T];


        for(int i=0;i<T;i++){
            num[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(num, Comparator.reverseOrder());

        int s1 = 0;
        int s2 = 1;
        int s3 = 2;

        boolean flag = false;

        while(s3<T){
            int check = num[s2]+num[s3];

            if(check<=num[s1]){
                s1++;
                s2++;
                s3++;
            }else{
                System.out.println(num[s1]+check);
                flag = true;
                break;
            }
        }

        if(!flag){
            System.out.println(-1);
        }

    }
}
