package code;


import java.util.Scanner;

public class j2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int cnt = 1,start = 1,end = 1, sum = 1;

        while(end!=N){
            if(sum == N){
                cnt++;
                end++;
                sum = sum+end;
            }
            else if(sum > N){
                sum = sum - start;
                start++;
            }
            else if (sum<N){
                end++;
                sum = sum+end;
            }
        }

        System.out.println(cnt);

    }
}
