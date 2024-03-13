package code.theory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 원형큐 {
    // LinkedList로 구현하여 앞으로 보내고 뒤로 보내는 연산을 작업하는 문제
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        LinkedList<Integer> deque = new LinkedList<>();
        int [] target = new int[M];
        for(int i = 1;i<=N;i++){
            deque.add(i);
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            target[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;

        for(int i=0;i<M;i++){
            int target_idx = deque.indexOf(target[i]);
            int half_idx;

            if(deque.size() % 2 == 0) {
                half_idx = deque.size() / 2 - 1;
            }
            else {
                half_idx = deque.size() / 2;
            }

            if(target_idx <= half_idx){
                for(int j=0;j<target_idx; j++){
                    int temp  = deque.pollFirst();
                    deque.offerLast(temp);
                    count++;
                }
            }
            else{
                for(int j=0; j<deque.size()-target_idx; j++){
                    int temp = deque.pollLast();
                    deque.offerFirst(temp);
                    count++;
                }
            }
            deque.pollFirst();
        }

        System.out.println(count);


    }
}
