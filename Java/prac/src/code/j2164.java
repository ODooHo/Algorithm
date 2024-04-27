package code;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class j2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> card = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            card.add(i + 1);
        }


        while (card.size() != 1) {
            card.remove();
            int a = card.remove();
            card.add(a);
        }

        System.out.println(card.peek());


    }
}
