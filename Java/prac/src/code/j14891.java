package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class j14891 {
    static List<LinkedList<Character>> total = new ArrayList<>();
    static int point = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int i=0; i<4;i++){
            String temp = br.readLine();
            LinkedList<Character> gear = new LinkedList<>();
            for (char c : temp.toCharArray()) {
                gear.add(c);
            }
            total.add(gear);
        }

        int T  = Integer.parseInt(br.readLine());

        for(int i=0; i<T;i++){
            st = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(st.nextToken());
            int direction = Integer.parseInt(st.nextToken());
            gearOperation(idx-1,direction);
        }

        for (LinkedList<Character> characters : total) {
            System.out.println(characters.get(0));
        }

        calculate();

        System.out.println(point);


    }


    static void gearOperation(int i, int direction){
        left(i-1,-direction);
        right(i+1,-direction);
        rotation(i,direction);
    }

    static void left(int i, int direction){
        if(i<0){
            return;
        }
        LinkedList<Character> current = total.get(i);
        LinkedList<Character> next = total.get(i + 1);
        if(current.get(2) == next.get(6)){
            return;
        }
        left(i-1,-direction);
        rotation(i,direction);
    }

    static void right(int i, int direction){
        if(i>3){
            return;
        }
        LinkedList<Character> current = total.get(i);
        LinkedList<Character> next = total.get(i-1);
        if(current.get(2) == next.get(6)){
            return;
        }
        right(i+1,-direction);
        rotation(i,direction);
    }


    static void rotation(int i, int direction){
        LinkedList<Character> temp = total.get(i);
        if(direction == 1){
            clock(temp);
        }
        else{
            reverse(temp);
        }
    }



    static void clock(LinkedList<Character> gear){
        Character c = gear.pollLast();
        gear.offerFirst(c);
    }

    static void reverse(LinkedList<Character> gear){
        Character c = gear.pollFirst();
        gear.offerLast(c);
    }

    static void calculate(){
        for(int i=0; i<4;i++){
            LinkedList<Character> temp = total.get(i);
            switch (i){
                case 0:
                    if(temp.get(0) == '1'){
                        point +=1;
                    }
                    break;
                case 1:
                    if(temp.get(0) == '1'){
                        point +=2;
                    }
                    break;
                case 2:
                    if(temp.get(0) == '1'){
                        point +=4;
                    }
                    break;
                case 3:
                    if(temp.get(0) == '1'){
                        point +=8;
                    }
                    break;
            }

            System.out.println(point);
        }
    }
}
