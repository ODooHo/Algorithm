package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class j2607 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String first = br.readLine();
        char[] temp = first.toCharArray();
        Set<Character> standard = new HashSet<>();
        for (char c : temp) {
            standard.add(c);
        }
        int cnt = 0;
        for(int i=0; i<N-1; i++){
            Set<Character> check = new HashSet<>();
            String word = br.readLine();
            char[] words = word.toCharArray();
            for (char c : words) {
                check.add(c);
            }
            if(standard.equals(check)){
                if(first.length()+1>=word.length()){
                    cnt++;
                }
            }
            else if(first.length() == word.length()){
                int stack = 0;
                for (Character s : standard) {
                    for (Character c : check) {
                        if(s==c){
                            stack++;
                        }
                    }
                }
                if(stack==first.length()-1){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
