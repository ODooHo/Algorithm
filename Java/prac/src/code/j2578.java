package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class j2578 {
    static String[][] bingo = new String[5][5];
    static int count;
    static boolean flag = false;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;


        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                bingo[i][j] = st.nextToken();
            }
        }

        int sequence = 0;

        for(int i=0; i<5; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<5; j++){
                String temp = st.nextToken();
                sequence++;
                for(int x=0; x<5; x++) {
                    for(int y = 0; y<5;y++){
                        if(bingo[x][y].equals(temp)){
                            bingo[x][y] = "X";
                        }
                        width();
                        length();
                        left();
                        right();
                        if(!flag && count >= 3){;
                            flag = true;
                            System.out.println(sequence);
                            break;
                        }
                        count = 0;
                    }
                }
            }
        }


    }

    public static void width(){
        for(int i=0; i<5; i++){
            int check = 0;
            for(int j=0;j<5;j++){

                if(bingo[i][j].equals("X")){
                    check++;
                }
            }
            if(check == 5){
                count++;
            }
        }
    }

    public static void length(){
        for(int i=0; i<5; i++){
            int check = 0;
            for(int j=0;j<5;j++){
                if(bingo[j][i].equals("X")){
                    check++;
                }
            }
            if(check == 5){
                count++;
            }
        }
    }

    public static void left(){
        int check = 0;
        for(int i=0; i<5; i++){
            if(bingo[i][i].equals("X")){
                check++;
            }
        }
        if(check == 5){
            count++;
        }
    }

    public static void right(){
        int check = 0;
        for(int i=0; i<5; i++){
            if(bingo[i][4-i].equals("X")){
                check++;
            }
        }
        if(check == 5){
            count++;
        }
    }
}
