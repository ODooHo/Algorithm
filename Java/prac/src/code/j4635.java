package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j4635 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T;
        while(true){
            T = Integer.parseInt(br.readLine());
            if(T == -1){
                break;
            }else{
                int beforeT = 0;
                int result = 0;
                for(int i = 0; i < T; i++){
                    st = new StringTokenizer(br.readLine());
                    int s = Integer.parseInt(st.nextToken());
                    int t = Integer.parseInt(st.nextToken());
                    if(i == 0){
                        beforeT = t;
                        result += s * t;
                    }else{
                        result += (s * (t - beforeT));
                        beforeT = t;
                    }
                }
                System.out.println(result + " miles");
            }
        }
    }
}
