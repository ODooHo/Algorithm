package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class j2822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Node> answer = new ArrayList<>();
        List<Integer> sequence = new ArrayList<>();

        for(int i=1;i<9;i++){
            answer.add(new Node(i,Long.valueOf(br.readLine())));
        }

        answer.sort(Collections.reverseOrder());

        long result = 0;


        for(int i=0;i<5;i++){
            result += answer.get(i).value;
            sequence.add(answer.get(i).idx);
        }

        Collections.sort(sequence);

        System.out.println(result);
        for (Integer i : sequence) {
            System.out.print(i + " ");
        }

    }


    static class Node implements Comparable<Node>{
        Integer idx;
        Long value;

        public Node(Integer idx, Long value) {
            this.idx = idx;
            this.value = value;
        }

        @Override
        public int compareTo(Node o) {
            return Long.compare(this.value,o.value);
        }
    }
}
