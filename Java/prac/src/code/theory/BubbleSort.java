package code.theory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BubbleSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int list[] = new int[10];
        for(int i = 0; i < 10; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }

        int temp = 0;
        for(int i = 1; i<10; i++){
            for (int j=0; j<10-i; j++){
                if(list[j] > list[j+1]){
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }

        for(int i=0; i<10; i++){
            System.out.println(list[i]);
        }





    }
}
