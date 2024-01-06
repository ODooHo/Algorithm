package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j13413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        for(int x=0; x<t; x++){
            int n = Integer.parseInt(br.readLine());
            char[] current = new char[n];
            char[] result = new char[n];

            String temp = br.readLine();
            current = temp.toCharArray();
            temp = br.readLine();
            result = temp.toCharArray();
            int cntA = 0;
            int cntB = 0;
            for(int i=0;i<n;i++){
                if(current[i] != result[i]){
                    if(current[i] == 'B'){
                        cntA++;
                    }else{
                        cntB++;
                    }
                }
            }
            int count = (Math.min(cntA,cntB) + Math.abs(cntA-cntB));
            System.out.println(count);
        }
    }
}
