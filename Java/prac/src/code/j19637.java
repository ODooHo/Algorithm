package code;

import java.io.*;
import java.util.*;

public class j19637 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();


        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Pair> title = new ArrayList<>();

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            int b = Integer.parseInt(st.nextToken());
            Pair temp = new Pair(a,b);
            title.add(temp);
        }


        for(int i=0;i<M;i++){
            int x = Integer.parseInt(br.readLine());
            int bs = bs(title, x);
            Pair pair = title.get(bs);
            sb.append(pair.first + "\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    private static int bs(List<Pair> title, int cnt){
        int start = 0;
        int end = title.size()-1;
        int mid = 0;
        int result = 0;
        while(start <= end){
            mid = (start + end) / 2;
            Pair temp = title.get(mid);
            if(temp.second >= cnt){
                end = mid -1;
                result = mid;
            }
            else{
                start = mid + 1;
            }
        }

        return result;
    }

    private static class Pair{
        String first;
        int second;

        public Pair(String first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
