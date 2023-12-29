package code.theory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 유클리드 {
    //두 수의 최대 공약수를 찾는 알고리즘
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //a가 더 큰 값이라고 가정
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());



        int temp =0;
        int result = 0;
        while(true){
            temp = a%b;
            if(temp == 0){
                result = b;
                break;
            }
            a = b;
            b = temp;

        }


        System.out.println(result);

    }
}
