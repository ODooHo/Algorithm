package code;

import java.io.*;
import java.util.Stack;

public class j9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t<T; t++){
            boolean flag = true;
            Stack<Character> stack = new Stack<>();
            String temp = br.readLine();

            for(Character c : temp.toCharArray()){
                if(c == '('){
                    stack.push(c);
                }
                else{
                    if(!stack.isEmpty()){
                        stack.pop();
                    }
                    else{
                        flag = false;
                        break;
                    }
                }
            }
            if(!stack.isEmpty()){
                flag = false;
            }

            if(flag){
                bw.append("YES\n");
            }else{
                bw.append("NO\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
