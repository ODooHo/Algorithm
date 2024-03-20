package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class j2596 {
    static Map<Character,String> letter = new HashMap<>();
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        letter.put('A',"000000");
        letter.put('B',"001111");
        letter.put('C',"010011");
        letter.put('D',"011100");
        letter.put('E',"100110");
        letter.put('F',"101001");
        letter.put('G',"110101");
        letter.put('H',"111010");

        int len = sc.nextInt();
        List<Character[]> result = new ArrayList<>();

        String next = sc.next();
        char[] charArray = next.toCharArray();

        char[] temp = new char[6];
        for(int i=1;i<len+1;i++){
            for(int j=0;j<6;j++){

            }
        }


    }
}
