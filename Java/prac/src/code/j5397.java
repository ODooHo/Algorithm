package code;

import java.io.*;
import java.util.LinkedList;
import java.util.Stack;

public class j5397 {
    static int T;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());

        for(int x=0;x<T;x++){
            String temp = br.readLine();
            char[] password = temp.toCharArray();
            Stack<Character> result = new Stack<>();
            Stack<Character> stack = new Stack<>();

            for (char c : password) {
                if(c == '<'){
                    if(!result.isEmpty()){
                        Character next = result.pop();
                        stack.push(next);
                    }
                }
                else if(c == '>'){
                    if(!stack.isEmpty()){
                        Character pop = stack.pop();
                        result.push(pop);
                    }
                }
                else if(c == '-'){
                    if(!result.isEmpty()){
                        result.pop();
                    }
                }else{
                    result.push(c);
                }
            }

            while(!stack.isEmpty()) {
                result.push(stack.pop());
            }


            for(int i=0;i<result.size();i++){
                bw.write(result.get(i));
            }
            bw.write("\n");

            /**
             * '<'를 만나면 왼쪽으로 한칸, '>'를 만나면 오른쪽으로 한 칸 가야돼
             * - 나오면 그 전에꺼 지우는거고
             * @<<BP<AC>DF-
             *
             * BACPD
             */

        }

        bw.flush();
        bw.close();
    }
}




