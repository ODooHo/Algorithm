package code;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class j7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        HashMap<String,String> log = new HashMap<>();

        for(int i=0; i<n;i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String check = st.nextToken();
            if(check.equals("enter")){
                log.put(name,check);
            }else{
                log.remove(name);
            }
        }

        Set<String> temp = log.keySet();

        List<String> people = new ArrayList<>(temp);

        people.sort(Collections.reverseOrder());

        for (String person : people) {
            bw.append(person).append("\n");
        }

        bw.flush();
        bw.close();
    }
}
