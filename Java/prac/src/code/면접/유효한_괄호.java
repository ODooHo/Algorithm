package code.면접;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 유효한_괄호 {
    public static void main(String[] args) throws IOException {
        /**
         * 괄호가 유효한지 판별하는 프로그램
         * 다음 괄호를 만날 때 스택에서 꺼내서 만약에 쌍이 안맞으면 틀린거 아닌가
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            Stack<Character> stack = new Stack<>();
            String line = br.readLine();
            if(line.equals("exit")){
                break;
            }
            boolean flag = true;

            for (char c : line.toCharArray()) {
                if(c == '(' || c == '{' || c == '['){
                    stack.push(c);
                }
                if(c == ')'){
                    if(stack.isEmpty()){
                        flag = false;
                        break;
                    }
                    else{
                        Character pop = stack.pop();
                        if(pop != '('){
                            flag = false;
                        }
                    }
                }
                if(c == '}'){
                    if(stack.isEmpty()){
                        flag = false;
                        break;
                    }
                    else{
                        Character pop = stack.pop();
                        if(pop != '{'){
                            flag = false;
                        }
                    }
                }
                if(c == ']'){
                    if(stack.isEmpty()){
                        flag = false;
                        break;
                    }
                    else{
                        Character pop = stack.pop();
                        if(pop != '['){
                            flag = false;
                        }
                    }
                }
            }
            if(!stack.isEmpty()){
                flag = false;
            }

            if(flag){
                System.out.println("Correct!");
            }else{
                System.out.println("Incorrect!");
            }
        }



    }
}
