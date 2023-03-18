package BaekJoonStep.s15;
//https://www.acmicpc.net/problem/13241 - 최소공배수

import java.util.Scanner;

public class P13241 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        long res = (long) a*b;
        while(b!=0) {
            int r = a%b;
            a = b;
            b = r;
        }
        System.out.println(res/a);
    }
}
