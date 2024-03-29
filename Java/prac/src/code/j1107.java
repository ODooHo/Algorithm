package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class j1107 {
    static int N;
    static int M;
    static HashSet<Integer> button = new HashSet<>(
            Arrays.asList(0,1,2,3,4,5,6,7,8,9)
    );
    static int start = 100;
    static List<Integer> result = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        if(M != 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0;i<M;i++){
                int temp = Integer.parseInt(st.nextToken());
                for (int check : button) {
                    if(check == temp){
                        button.remove(temp);
                    }
                }
            }
        }

        //첫 번째 작업. 타겟 정수와 현재 위치의 차이 계산
        if(N == start){
            System.out.println(0);
        } else{
            result.add(Math.abs(start-N));
        }

    }
}
