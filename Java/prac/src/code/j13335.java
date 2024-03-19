package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class j13335 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());



        Queue<Integer> truck = new LinkedList<>();
        Queue<Integer> bridge = new LinkedList<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            truck.add(Integer.valueOf(st.nextToken()));
        }

        for(int i = 0; i<w; i++){
            bridge.add(0);
        }

        int time = 0;
        int sum = 0;

        while(!bridge.isEmpty()){
            time++;
            sum -= bridge.poll();
            if(!truck.isEmpty()){
                if(sum + truck.peek()<=l){
                    int next = truck.poll();
                    sum += next;
                    bridge.add(next);
                }
                else{
                    bridge.add(0);
                }
            }
        }

        System.out.println(time);




        /**
         * 한대밖에 못 올라갈 경우 한 트럭 다 나가고 출발해야함
         * -> 소요시간 = w
         * 한대 이상 올라갈 수 있으면 트럭 다 안나가도 1초 뒤에 바로 출발 가능
         * -> 소요시간은 마지막 들어온 차량 시간 + w
         * 2대일 경우로 예를 들자면 2번 차량 진입(진입 시간 3초), 이후 1초 뒤 3번 차량 진입(진입 시간 4초), 이후 진입 불가라면
         * 4초 + 2 -> 6초에 진입 가능
         */
    }
}
