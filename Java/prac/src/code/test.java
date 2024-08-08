package code;

import java.io.*;
import java.util.*;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Num> heap = new PriorityQueue<>();

        for(int i=0; i<N;i++) {
            int temp = Integer.parseInt(br.readLine());

            if(temp != 0){
                int av = Math.abs(temp);
                Num value = new Num(av,temp);
                heap.add(value);
            }else{
                Num poll = heap.poll();
                if(poll==null){
                    bw.append(0 + "\n");
                }else{
                    bw.append(poll.rv + "\n");
                }
            }
        }


        bw.flush();
        bw.close();

    }

    static class Num implements Comparable<Num>{
            Integer av;
            Integer rv;


            public Num(Integer av, Integer rv){
                this.av = av;
                this.rv = rv;
            }


        @Override
        public int compareTo(Num o) {
            if(this.av == o.av){
                return this.rv.compareTo(o.rv);
            }
            return this.av - o.av;
        }
    }

}