package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.StringTokenizer;

public class j30502 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Creature> creatureList = new ArrayList<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int min = 0;
        int max = 0;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int idx = Integer.parseInt(st.nextToken());
            String specific = st.nextToken();
            int isExisted = Integer.parseInt(st.nextToken());

            boolean flag = false;
            for (Creature creature : creatureList) {
                if(creature.idx == idx){
                    creature.specifics.add(new Specific(specific,isExisted));
                    flag = true;
                }
            }
            if(!flag){
                List<Specific> specificsList = new ArrayList<>(); // 변경 가능한 리스트 생성
                specificsList.add(new Specific(specific, isExisted));
                creatureList.add(new Creature(idx, specificsList));
            }
        }
        for (Creature creature : creatureList) {
            if (creature.specifics.size() == 2) {
                boolean pFlag = false;
                boolean mFlag = false;
                for (Specific specific : creature.specifics) {
                    if (Objects.equals(specific.type, "P") && specific.isExisted == 1) {
                        pFlag = true;
                    } else if (Objects.equals(specific.type, "M") && specific.isExisted == 0) {
                        mFlag = true;
                    }
                }
                if (pFlag && mFlag) {
                    max++;
                    min++;
                } else if (pFlag || mFlag) {
                    max++;
                }
            } else {
                Specific specific = creature.specifics.get(0);
                if (Objects.equals(specific.type, "P") && specific.isExisted == 1) {
                    max++;
                } else if (Objects.equals(specific.type, "M") && specific.isExisted == 0) {
                    max++;
                }
            }
        }

        if(creatureList.size()!= N){
            max++;
        }
        System.out.println(min + " " + max);
    }


    static class Creature {
        int idx;
        List<Specific> specifics;


        Creature(int idx, List<Specific>specifics) {
            this.idx = idx;
            this.specifics =specifics;
        }
    }


    static class Specific{
        String type;
        int isExisted;

        Specific(String type, int isExisted){
            this.type = type;
            this.isExisted = isExisted;
        }
    }


}
