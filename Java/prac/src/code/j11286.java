package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class j11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Num> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(br.readLine());
            Num num = new Num(Math.abs(temp), temp);
            if (temp == 0) {
                if (priorityQueue.isEmpty()) {
                    System.out.println(0);
                } else {
                    Num check = priorityQueue.remove();
                    System.out.println(check.num);
                }
            } else {
                priorityQueue.add(num);
            }

        }


    }

    static class Num implements Comparable<Num> {
        private int abs;
        private Integer num;

        public Num(int a, int b) {
            this.abs = a;
            this.num = b;
        }

        @Override
        public int compareTo(Num o) {
            if (this.abs == o.abs) {
                return this.num.compareTo(o.num);
            }
            return this.abs - o.abs;
        }
    }
}
