package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class j15903 {
    static long N;
    static long M;
    static PriorityQueue<Long> queue = new PriorityQueue<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N;i++){
            queue.add(Long.valueOf(st.nextToken()));
        }

        long cnt = 0;
        int idx = 0;
        for(int i=0;i<M;i++){
            long[] temp = new long[1001];
            long a = queue.poll();
            long b = queue.poll();
            long sum = a+b;
            queue.add(sum);
            queue.add(sum);
        }

        for (Long i : queue) {
            cnt+=i;
        }

        System.out.println(cnt);
    }


}
