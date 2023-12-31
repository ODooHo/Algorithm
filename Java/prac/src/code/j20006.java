package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class j20006 {

    static class Room{
        public int standard;
        public List<User> users;

        public Room(int standard, User user) {
            this.standard = standard;
            this.users.add(user);
        }

    }


    static class User implements Comparable<User>{
        public int level;
        public String name;

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

        @Override
        public int compareTo(User o)
        {
            return this.name.compareTo(o.name);
        }
    }
    static List<Room> wait;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for(int x=0;x<p;x++){
            st = new StringTokenizer(br.readLine());
            int level = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            User user = new User(level,name);
            boolean flag = false;

            for(int i=0;i<wait.size();i++){
                Room temp = wait.get(i);

                int check = Math.abs(temp.standard - user.level);

                if(temp.users.size()>=m){
                    continue;
                }

                if(check <= 10){
                    temp.users.add(user);
                    flag = true;
                    break;
                }

            }

            if(flag == false){
                Room room = new Room(level,user);
                wait.add(room);
            }


        }

        for(int i=0;i<wait.size();i++){
            Room result = wait.get(i);
            if(result.users.size() >=m){
                System.out.println("Started!");
            }else{
                System.out.println("Waiting!");
            }
            Collections.sort(result.users);

            for(int j=0;j<result.users.size();j++){
                User user = result.users.get(j);
                System.out.println(user.level + " " + user.name);
            }
        }

    }

}


