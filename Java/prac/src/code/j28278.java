package code;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class j28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());

            switch (cmd) {
                case 1:
                    int temp = Integer.parseInt(st.nextToken());
                    stack.push(temp);
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        int pop = stack.pop();
                        bw.append(pop + "\n");
                    } else {
                        bw.append(-1 + "\n");
                    }
                    break;
                case 3:
                    bw.append(stack.size() + "\n");
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        bw.append(1 + "\n");
                    } else {
                        bw.append(0 + "\n");
                    }
                    break;
                case 5:
                    if (!stack.isEmpty()) {
                        int peek = stack.peek();
                        bw.append(peek + "\n");
                    } else {
                        bw.append(-1 + "\n");
                    }
                    break;
            }
        }

        bw.flush();
        bw.close();

    }
}
