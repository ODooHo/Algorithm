package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j1011 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t<T; t++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int d = y-x;

            int k = (int) Math.sqrt(d);

            if(k == Math.sqrt(d)){
                System.out.println(2*k -1);
            }
            else if(d<= k*k+k){
                System.out.println(2*k);
            }
            else{
                System.out.println(2*k+1);
            }

        }
    }
}
