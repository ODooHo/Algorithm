package code;

import java.io.*;
import java.util.*;

public class j10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        List<User> people = new ArrayList<>();
        StringTokenizer st;


        for(int i=0; i<N;i++){
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            people.add(new User(age,name));
        }

        Collections.sort(people);

        for (User person : people) {
            bw.write(person.age + " " + person.name + "\n");
        }

        bw.flush();
        bw.close();
    }

    static class User implements Comparable<User>{
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(User o) {
            return Integer.compare(this.age,o.age);
        }
    }
}
