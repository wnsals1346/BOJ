package BaekJoonStep.s15;
//https://www.acmicpc.net/problem/3053 - 택시 기하학

import java.util.Scanner;

public class P3053 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        final double PI = Math.PI;
        System.out.printf("%.6f\n",num*num*PI);
        System.out.printf("%.6f",2.0*num*num);
    }

}
