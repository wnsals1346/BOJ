package BaekJoonStep.s21;
//https://www.acmicpc.net/problem/4949 - 균형잡힌 세상

import java.io.IOException;
import java.util.Stack;

public class P4949 {
    public static void main(String[] args) throws IOException {
        boolean ans;
        int c = System.in.read();
        Stack<Integer> stack;
        StringBuilder sb = new StringBuilder();

        while(c!='.') {
            stack = new Stack<>();
            ans = true;
            while(c!=10) {
                if(c=='(' || c=='[') {
                    if(c=='(') stack.push((int)')');
                    else stack.push((int)']');
                } else if (c==')' || c==']') {
                    if(stack.empty()) {
                        ans = false;
                    } else {
                        if(c!=stack.pop()) {
                            ans = false;
                        }
                    }
                }
                c = System.in.read();
            }
            if(!stack.empty()) {
                ans = false;
            }
            if(ans) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
            c = System.in.read();
        }
        System.out.println(sb);

    }
}
