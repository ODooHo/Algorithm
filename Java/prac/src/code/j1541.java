package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class j1541 {
    static int result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] a;

        a = line.split("-");

        for(int i=0; i<a.length; i++){
            int temp = Sum(a[i]);
            if(i==0){
                result +=temp;
            }else{
                result -=temp;
            }
        }

        System.out.println(result);
    }

    private static int Sum(String a){
        int sum = 0;
        String[] temp = a.split("\\+");
        for(int i=0; i<temp.length; i++){
            sum += Integer.parseInt(temp[i]);
        }

        return sum;
    }
}
