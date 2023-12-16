package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class j1940 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] material = new int[N];

        for(int i = 0; i < N; i++){
            material[i] = sc.nextInt();
            System.out.println("material = " + material[i]);
        }



    }
}
