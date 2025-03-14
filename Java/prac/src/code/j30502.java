package code;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class j30502 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Creature> creatures = new LinkedList<>();
        for (int i = 0; i < N + 1; i++) {
            creatures.add(new Creature(-1,-1));
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(st.nextToken());
            String sp = st.nextToken();
            int isExisted = Integer.parseInt(st.nextToken());

            if (sp.equals("P")) {
                creatures.get(idx).p = isExisted;
            } else {
                creatures.get(idx).m = isExisted;
            }
        }
        int min = 0;
        int max = 0;

        for (int i = 1; i < N + 1; i++) {
            Creature temp = creatures.get(i);
            if (temp.p == 1 && temp.m == 0) {
                min++;
            }
            if((temp.p == 1 || temp.p == -1) &&(temp.m == 0 || temp.m == -1)){
                max++;
            }
        }

        System.out.println(min + " " + max);
    }
    private static class Creature {
        int p;
        int m;

        public Creature(int p, int m) {
            this.p = p;
            this.m = m;
        }
    }
}
