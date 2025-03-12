package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class j6373 {
    public static void main(String[] args) throws IOException {
        while (true) {
            try {
                solution();
            } catch (Exception e) {
                break;
            }
        }
    }

    private static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] count = new int[10];
        String inputString = br.readLine();
        char[] split = inputString.toCharArray();
        BigInteger calculated = new BigInteger(inputString);

        for (char c : split) {
            count[Integer.parseInt(String.valueOf(c))]++;
        }

        int[] initialCount = count.clone();

        // 순환 비교를 위해, 실제 회전된 숫자를 확인
        for (int i = 2; i < inputString.length() + 1; i++) {
            BigInteger temp = calculated.multiply(BigInteger.valueOf(i));
            String tempString = temp.toString();
//            System.out.println("Checking multiplication by " + i + ": " + tempString);

            // 자릿수 순서를 회전시켜 비교 (원본 숫자의 순열 중 하나가 되어야 함)
            if (!isCyclic(tempString, inputString)) {
                System.out.println(inputString + " is not cyclic");
                return;
            }
        }

        System.out.println(inputString + " is cyclic");
    }

    // 숫자의 순열을 회전하여 비교
    private static boolean isCyclic(String result, String original) {
        String doubled = original + original;  // 원본 숫자를 두 번 이어 붙여서 회전된 형태를 포함시킴
        return doubled.contains(result);  // 회전된 결과가 원본 숫자의 순열에 포함되면 cyclic
    }
}
