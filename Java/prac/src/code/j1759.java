package code;

import java.io.*;
import java.util.*;

public class j1759 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int L = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        List<String> password = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<C; i++){
            password.add(st.nextToken());
        }
        Collections.sort(password);


        
        while(password.size()>= L){

        }

    }
}
