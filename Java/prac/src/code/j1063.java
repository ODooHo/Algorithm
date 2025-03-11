package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j1063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] k = st.nextToken().toCharArray();
        char[] s = st.nextToken().toCharArray();
        int k1 = switchingAlphabetToNumber(k[0]);
        int s1 = switchingAlphabetToNumber(s[0]);

        int[] king = new int[2];
        int[] stone = new int[2];
        king[0] = k1;
        king[1] = Integer.parseInt(String.valueOf(k[1]));
        stone[0] = s1;
        stone[1] = Integer.parseInt(String.valueOf(s[1]));

        int N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            String move = br.readLine();
            switch (move) {
                case "R":
                    if(king[0] + 1 >= 9){
                        break;
                    }
                    king[0]++;
                    if(king[0] == stone[0] && king[1] == stone[1]){
                        if(stone[0] + 1 >= 9){
                            king[0]--;
                            break;
                        }else{
                            stone[0]++;
                        }
                    }
                    break;
                case "L":
                    if(king[0] - 1 <= 0){
                        break;
                    }
                    king[0]--;
                    if(king[0] == stone[0] && king[1] == stone[1]){
                        if(stone[0] - 1 <= 0){
                            king[0]++;
                            break;
                        }else{
                            stone[0]--;
                        }
                    }
                    break;
                case "B":
                    if(king[1] - 1 <= 0){
                        break;
                    }
                    king[1]--;
                    if(king[0] == stone[0] && king[1] == stone[1]){
                        if(stone[1] - 1 <= 0){
                            king[1]++;
                            break;
                        }else{
                            stone[1]--;
                        }
                    }
                    break;
                case "T":
                    if(king[1] + 1 >= 9){
                        break;
                    }
                    king[1]++;
                    if(king[0] == stone[0] && king[1] == stone[1]){
                        if(stone[1] + 1 >= 9){
                            king[1]--;
                            break;
                        }else{
                            stone[1]++;
                        }
                    }
                    break;
                case "RT":
                    if(king[0] + 1 >= 9 || king[1] + 1 >= 9){
                        break;
                    }
                    king[0]++;
                    king[1]++;
                    if(king[0] == stone[0] && king[1] == stone[1]){
                        if(stone[0] + 1 >= 9 || stone[1] + 1 >= 9){
                            king[0]--;
                            king[1]--;
                            break;
                        }else{
                            stone[0]++;
                            stone[1]++;
                        }
                    }
                    break;
                case "LT":
                    if(king[0] - 1 <= 0 || king[1] + 1 >= 9){
                        break;
                    }
                    king[0]--;
                    king[1]++;
                    if(king[0] == stone[0] && king[1] == stone[1]){
                        if(stone[0] - 1  <= 0 || stone[1] + 1 >= 9){
                            king[0]++;
                            king[1]--;
                            break;
                        }else{
                            stone[0]--;
                            stone[1]++;
                        }
                    }
                    break;
                case "RB":
                    if(king[0] + 1 >= 9 || king[1] - 1 <= 0){
                        break;
                    }
                    king[0]++;
                    king[1]--;
                    if(king[0] == stone[0] && king[1] == stone[1]){
                        if(stone[0] + 1 >= 9 || stone[1] - 1 <= 0){
                            king[0]--;
                            king[1]++;
                            break;
                        }else{
                            stone[0]++;
                            stone[1]--;
                        }
                    }
                    break;
                case "LB":
                    if(king[0] - 1 <= 0 || king[1] - 1 <= 0){
                        break;
                    }
                    king[0]--;
                    king[1]--;
                    if(king[0] == stone[0] && king[1] == stone[1]){
                        if(stone[0] - 1 <= 0 || stone[1] -1 <= 0){
                            king[0]++;
                            king[1]++;
                            break;
                        }else{
                            stone[0]--;
                            stone[1]--;
                        }
                    }
                    break;
            }
        }
        System.out.println(switchingNumberToAlphabet(king[0]) + king[1]);
        System.out.println(switchingNumberToAlphabet(stone[0]) + stone[1]);

    }

    public static int switchingAlphabetToNumber(char str) {
        return switch (str) {
            case 'A' -> 1;
            case 'B' -> 2;
            case 'C' -> 3;
            case 'D' -> 4;
            case 'E' -> 5;
            case 'F' -> 6;
            case 'G' -> 7;
            case 'H' -> 8;
            default -> throw new IllegalStateException("Unexpected value: " + str);
        };
    }

    public static String switchingNumberToAlphabet(int num) {
        return switch (num) {
            case 1 -> "A";
            case 2 -> "B";
            case 3 -> "C";
            case 4 -> "D";
            case 5 -> "E";
            case 6 -> "F";
            case 7 -> "G";
            case 8 -> "H";
            default -> throw new IllegalStateException("Unexpected value: " + num);
        };
    }

}
