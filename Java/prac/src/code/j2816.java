package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j2816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] channel = new String[N];

        for(int t = 0; t< N; t++){
            channel[t] = br.readLine();
        }

        for(int i = 0; i < N; i++){
            if(channel[i].equals("KBS1")){
                String temp;
                for(int j = i; j>0; j--){
                    System.out.print(4);
                    temp = channel[i-1];
                    channel[i-1] = channel[i];
                    channel[i] = temp;
                }
                break;
            }else{
                System.out.print(1);
            }
        }
        if(channel[1].equals("KBS2")){
            return;
        }

        for(int i = 0 ;i<N; i++) {
            if(channel[i].equals("KBS2")) {//KBS2를 두번쨰로
                String temp;
                for(int j = i; j>1; j--) {
                    System.out.print(4);
                    temp = channel[j-1];
                    channel[j-1] = channel[j];
                    channel[j] = temp;
                }
                break;
            }
            else
                System.out.print(1);
        }
    }

}