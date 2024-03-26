package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class j31287 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String move = br.readLine();
        for(int i = 0; i<k;i++){
            move += move;
        }

        int x = 0;
        int y = 0;
        boolean flag = false;
        for(int i=0; i<n;i++){
            switch (move.charAt(i)){
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
            }
            if(x==0 && y == 0){
                flag = true;
                System.out.println("YES");
                break;
            }
        }
        if(!flag){
            System.out.println("NO");
        }


    }
}
