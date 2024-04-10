package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j1629 {

    static long C;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        C = Long.parseLong(st.nextToken());

        System.out.println(recall(A,B));
    }

    static long recall(long A, long ex){
        if(ex == 1){
            return A % C;
        }

        long temp = recall(A,ex /2);

        if(ex % 2 == 1){
            return (temp * temp % C) * A % C;
        }
        return temp * temp % C;
    }
}
