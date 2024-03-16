package code;

import java.io.*;
import java.util.*;

public class j11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        char[] target = word.toCharArray();
        List<String> result = new ArrayList<>();

        Queue<Character> test = new LinkedList<>();
        for (char c : target) {
            test.add(c);
        }

        while(!test.isEmpty()){
            StringBuilder sb = new StringBuilder();
            for (Character c : test) {
                sb.append(c);
            }
            result.add(sb.toString());
            test.remove();
        }

        Collections.sort(result);

        for (String s : result) {
            bw.write(s + "\n");
        }
        bw.flush();
        bw.close();
    }
}
