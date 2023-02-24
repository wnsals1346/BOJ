package BaekJoonStep.s06;
//https://www.acmicpc.net/problem/10988 - 팰린드롬인지 확인하기

import java.util.Scanner;

public class P10988 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int flag = 1;
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i)) flag = 0;
        }
        System.out.println(flag);
    }
}
