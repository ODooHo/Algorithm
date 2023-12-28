package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.Collections;


public class j1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String number = br.readLine();
        int length = number.length();

        Integer[] check = new Integer[length];

        for(int i=0; i < length; i++){
            check[i] = Character.getNumericValue(number.charAt(i));
        }

        Arrays.sort(check,Collections.reverseOrder());

        for (Integer integer : check) {
            System.out.print(integer);
        }

    }
}
