package code;

import java.io.*;
import java.util.Stack;

public class j1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String previous = br.readLine();
        int M = Integer.parseInt(br.readLine());
        Stack<Character> result = new Stack<>();
        Stack<Character> command = new Stack<>();
        char[] previousArray = previous.toCharArray();

        for(int i=0;i<previousArray.length;i++){
            result.push(previousArray[i]);
        }

        for(int T = 0; T < M; T++){
            String next = br.readLine();
            char[] nextArray = next.toCharArray();
            if(nextArray[0] == 'P'){
                result.push(nextArray[2]);
            }
            else if(nextArray[0] == 'L'){
                if(!result.isEmpty()){
                    command.push(result.pop());
                }
            }
            else if(nextArray[0] == 'D'){
                if(!command.isEmpty()){
                    result.push(command.pop());
                }
            }
            else if(nextArray[0] == 'B'){
                if(!result.isEmpty()){
                    result.pop();
                }
            }
        }
        while(!command.isEmpty()){
            result.push(command.pop());
        }


        for (Character character : result) {
            bw.write(character);
        }

        bw.flush();
        bw.close();

    }
}
