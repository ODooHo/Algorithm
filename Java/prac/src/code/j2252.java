package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class j2252 {
    static ArrayList<Integer>[] student;
    static int [] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        check = new int[n+1];

        student = new ArrayList[n+1];

        for(int i=1;i<=n;i++){
            student[i] = new ArrayList<>();
        }

        for(int i=0; i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            student[a].add(b);
            check[b]++;
        }
        Queue<Integer> result = new LinkedList<>();
        ArrayList<Integer> answer = new ArrayList<>();


        for(int i=1;i<=n;i++){
            if(check[i]==0){
                result.add(i);
            }
        }
        while(!result.isEmpty()){
            int temp = result.poll();
            answer.add(temp);
            for (Integer x: student[temp]) {
                check[x]--;
                if(check[x] == 0){
                    result.add(x);
                }
            }
        }

        for (Integer i : answer) {
            System.out.print(i + " ");
        }
    }
}
