package code;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class j1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int temp[] = new int[n];

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++){
            temp[i] = Integer.parseInt(bf.readLine());
        }

        int count = 1;

        StringBuffer result = new StringBuffer();

        boolean flag = true;

        for(int i=0; i<n; i++){
            if(count <= temp[i]){
                while(count <= temp[i]){
                    stack.push(count);
                    result.append("+\n");
                    count++;
                }
                stack.pop();
                result.append("-\n");
            }
            else if (count > temp[i]){
                int check = stack.pop();
                if (check > temp[i]){
                    System.out.println("NO");
                    flag = false;
                    break;
                }
                else{
                    result.append("-\n");
                }
            }
        }

        if(flag){
            System.out.println(result.toString());
        }

    }
}
