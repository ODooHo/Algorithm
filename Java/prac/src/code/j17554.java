package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j17554 {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        boolean[] lights = new boolean[N+1];
        for(int i = 0; i < N+1; i++){
            lights[i] = true;
        }
        int k = Integer.parseInt(br.readLine());
        int max = -1;
        for(int t = 0; t < k; t++){
            int i = Integer.parseInt(br.readLine());
            for(int j = i; j <= N; j += i){
                lights[j] = !lights[j];
            }
            if(max < count(lights)){
                max = count(lights);
            }
        }


        System.out.println(max);
    }

    private static int count(boolean[] lights){
        int count = 0;
        for(int i = 1; i<N+1; i++){
            if(!lights[i]){
                count++;
            }
        }
        return count;
    }
}
