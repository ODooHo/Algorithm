package code;

import java.io.*;
import java.util.*;

public class j1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            Queue<Node> queue = new LinkedList<>();
            List<Node> printer = new ArrayList<>();

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                queue.add(new Node(Integer.parseInt(st.nextToken()),i));
            }
            while(!queue.isEmpty()){
                boolean flag = false;
                Node poll = queue.poll();
                for (Node node : queue) {
                    if(poll.priority < node.priority){
                        queue.add(poll);
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    printer.add(poll);
                }
            }

            for(int i=0;i<printer.size();i++){
                Node node = printer.get(i);
                if(node.sequence == M){
                    bw.write(i+1 + "\n");
                }
            }
        }

        bw.flush();
        bw.close();


    }

    static class Node {
        int priority;
        int sequence;

        public Node(int priority, int sequence) {
            this.priority = priority;
            this.sequence = sequence;
        }


    }
}

