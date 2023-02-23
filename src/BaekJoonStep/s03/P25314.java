package BaekJoonStep.s03;
//https://www.acmicpc.net/problem/25314 - 코딩은 체육과목 입니다

import java.util.Scanner;

public class P25314 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt()/4;
        StringBuilder sb = new StringBuilder();

        while(n-->0) {
            sb.append("long ");
        }
        sb.append("int");
        System.out.println(sb);
    }
}
