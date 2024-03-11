package code;

import java.io.*;
import java.util.*;

public class j22233 {
    static Map<String,Boolean> keyword = new HashMap<>();
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for(int i=0;i<N;i++){
            String temp = br.readLine();
            keyword.put(temp,false);
        }

        for(int i=0;i<M;i++){
            String temp = br.readLine();

            String[] check = temp.split(",");

            for (String s : check) {
                keyword.remove(s);
            }
            sb.append(keyword.size() + "\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
