package code;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class j2493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        List<Top> laser = new ArrayList<>();
        Stack<Top> result = new Stack<>();
        for(int i=0; i<N;i++) {
            int current = Integer.parseInt(st.nextToken());

            if(result.isEmpty()){
                sb.append("0 ");
                result.push(new Top(i+1,current));
            }
            else{
                while(true){
                    if(result.isEmpty()){
                        sb.append("0 ");
                        result.push(new Top(i+1,current));
                        break;
                    }
                    Top prev = result.peek();
                    if(prev.height>current){
                        sb.append(prev.sequence + " ");
                        result.push(new Top(i+1,current));
                        break;
                    }else{
                        result.pop();
                    }
                }
            }
        }

        System.out.println(sb.toString());


    }

    static class Top{
        int sequence;
        long height;

        public Top(int sequence, long height) {
            this.sequence = sequence;
            this.height = height;
        }
    }
}


/**
 * 스택이 비어있다면, 0을 출력하고 현재 높이를 push
 * 현재 높이를 peek하고, 들어온 입력값과 비교해서 만약 입력값이 더 크다면 peek한 탑의 번호를 출력하고 현재 탑을 push
 * 아니라면 stack을 pop하고 다시 비교
 */
