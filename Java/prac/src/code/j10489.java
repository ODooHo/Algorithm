package code;

import java.io.*;
import java.util.*;

public class j10489 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int card = Integer.parseInt(st.nextToken());

            if (!stack.isEmpty() && (stack.peek() + card) % 2 == 0) {
                stack.pop(); // 인접한 두 카드 제거
            } else {
                stack.push(card); // 제거할 수 없으면 스택에 추가
            }
        }

        System.out.println(stack.size()); // 남은 카드 개수 출력
    }
}
