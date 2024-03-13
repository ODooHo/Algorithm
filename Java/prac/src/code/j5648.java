package code;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class j5648 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        long[] arr = new long[n];
        String str = "", temp = "";

        while (n > 0) {
            while (st.hasMoreTokens()) {
                str = st.nextToken();
                temp = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    temp += str.charAt(i);
                }
                arr[--n] = Long.parseLong(temp);
            }
            if(n>0)
                st = new StringTokenizer(br.readLine());
        }
        Arrays.sort(arr);
        for (long num : arr) {
            bw.write(num + "\n");
        }
        bw.flush();
    }
}
