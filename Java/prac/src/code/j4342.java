package code;

import java.io.*;
import java.util.StringTokenizer;

public class j4342 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        while(true){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a == 0 && b == 0){
                break;
            }
            if(a<b){
                int temp = b;
                b = a;
                a = temp;
            }

            boolean result = game(a,b);

            if(result){
                sb.append("A wins\n");
            }else{
                sb.append("B wins\n");
            }

//            boolean result = game(a,b);
//
//            if(result){
//                System.out.println("A wins");
//            }else{
//                System.out.println("B wins");
//            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean game(int a, int b) {
        if(a%b==0){
            return true;
        }
        if(a-b < b){
            return game(a-b , b);
        }
        return true;
    }

}
