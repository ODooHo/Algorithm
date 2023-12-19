package code;

import java.util.Scanner;

public class j12891 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int P = sc.nextInt();

        String temp = sc.next();
        char[] dna = temp.toCharArray();

        int[] required = new int[4];

        for (int i=0; i<4; i++){
            required[i] = sc.nextInt();
        }

        int start = 0;
        int end = P-1;

        int A = 0,C = 0,G = 0,T = 0;

        for(int i = 0; i < P; i++){
            switch (dna[i]){
                case 'A':
                    A++;
                    break;
                case 'C':
                    C++;
                    break;
                case 'G':
                    G++;
                    break;
                case 'T':
                    T++;
                    break;
            }
        }

        int cnt = 0;

        while(end < S){
//            System.out.print(A);
//            System.out.print(C);
//            System.out.print(G);
//            System.out.println(T);
            if(A >= required[0] && C >= required[1] && G >= required[2] && T >= required[3]){
                cnt++;
            }

            switch (dna[start]){
                case 'A':
                    A--;
                    break;
                case 'C':
                    C--;
                    break;
                case 'G':
                    G--;
                    break;
                case 'T':
                    T--;
                    break;
            }
            start++;
            end++;
            if(end>=S){
                break;
            }
            switch (dna[end]){
                case 'A':
                    A++;
                    break;
                case 'C':
                    C++;
                    break;
                case 'G':
                    G++;
                    break;
                case 'T':
                    T++;
                    break;
            }


        }

        System.out.println(cnt);

    }
}
