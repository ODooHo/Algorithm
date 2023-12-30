package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class j20006 {
    static Queue<ArrayList<User>> Game;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] standards = new int[301];
        int count;
        for(int i=0;i<301; i++){
            standards[i] = -1;
        }

        for(int x=0;x<p;x++){
            st = new StringTokenizer(br.readLine());
            int level = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            User user = new User(level,name);
            if(x == 0){
                count = x;
                standards[x] = level;
                ArrayList<User> room = new ArrayList<>();
                room.add(user);
            }
            if(level>standa)
        }

    }

    static class User {
        private int level;
        private String name;

        public User(int level, String name) {
            this.level = level;
            this.name = name;
        }

        public int getLevel() {
            return level;
        }

        public String getName() {
            return name;
        }

    }
}


