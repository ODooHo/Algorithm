package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class j1515 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int pointer = 0;
        int base = 0;

        while(true){
            String tmp = String.valueOf(base);
            for (int i = 0; i < tmp.length(); i++) {
                if (tmp.charAt(i) == s.charAt(pointer))
                    pointer++;
                if (pointer == s.length()) {
                    System.out.println(base);
                    return;
                }
            }
            base++;
        }

    }
}
