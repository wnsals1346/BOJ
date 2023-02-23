package BaekJoonStep.s21;
//https://www.acmicpc.net/problem/10773 - 제로

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        while(t-->0) {
            int num = Integer.parseInt(br.readLine());
            if(num!=0) {
                stack.add(num);
            } else {
                stack.pop();
            }
        }
        int sum = 0;
        for (Integer num : stack) {
            sum += num;
        }
        System.out.println(sum);
    }
}
