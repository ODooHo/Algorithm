package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class j9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            List<Integer> measure = new ArrayList<>();
            if (n != -1) {
                for (int i = 1; i < n; i++) {
                    if (n % i == 0) {
                        measure.add(i);
                    }
                }
                int sum = 0;
                for (Integer i : measure) {
                    sum += i;
                }
                if (sum == n) {
                    System.out.print(n + " = ");
                    for (int j = 0; j < measure.size()-1; j++) {
                        System.out.print(measure.get(j) + " + ");
                    }
                    System.out.println(measure.get(measure.size() - 1));
                } else {
                    System.out.println(n + " is NOT perfect.");
                }
            } else {
                return;
            }
        }
    }
}
