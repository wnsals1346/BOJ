package BaekJoonStep.s11;
//https://www.acmicpc.net/problem/10872 - 팩토리얼

import java.util.Scanner;

public class P10872 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(factorial(in.nextInt()));
    }
    static int factorial(int n) {
        if(n==0 || n==1) return 1;
        return n*factorial(n-1);
    }
}
