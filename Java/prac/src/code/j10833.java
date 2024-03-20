package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j10833 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        int result = 0;
        for(int i=0; i<N;i++){
            st = new StringTokenizer(br.readLine());
            int students = Integer.parseInt(st.nextToken());
            int apple = Integer.parseInt(st.nextToken());

            int temp = apple % students;
            result+=temp;
        }

        System.out.println(result);
    }
}
