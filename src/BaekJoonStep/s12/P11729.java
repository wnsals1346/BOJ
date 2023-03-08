package BaekJoonStep.s12;
//https://www.acmicpc.net/problem/11729 - 하노이 탑 이동 순서

import java.util.Scanner;

public class P11729 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(hanoi(in.nextInt(),1,3,2));
        System.out.println(sb);
    }
    public static int hanoi(int n,int start, int end, int mid) {
        if(n==1) {
            return move(start,end);
        }
        return hanoi(n-1,start,mid,end) + move(start,end) + hanoi(n-1,mid,end,start);
    }
    static int move(int start, int end) {
        sb.append(start).append(" ").append(end).append("\n");
        return 1;
    }
}
