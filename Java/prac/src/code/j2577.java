package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] count = new int[10];
        long A = Long.parseLong(br.readLine());
        long B = Long.parseLong(br.readLine());
        long C = Long.parseLong(br.readLine());

        long temp = A * B * C;

        String parser = "";
        parser = parser+temp;
        char[] check = parser.toCharArray();

        for (char c : check) {
            switch (c){
                case '0':
                    count[0]++;
                    break;
                case '1':
                    count[1]++;
                    break;
                case '2':
                    count[2]++;
                    break;
                case '3':
                    count[3]++;
                    break;
                case '4':
                    count[4]++;
                    break;
                case '5':
                    count[5]++;
                    break;
                case '6':
                    count[6]++;
                    break;
                case '7':
                    count[7]++;
                    break;
                case '8':
                    count[8]++;
                    break;
                case '9':
                    count[9]++;
                    break;
            }
        }

        for (int i : count) {
            System.out.println(i);
        }

    }
}
