package BaekJoonStep.s08;
//https://www.acmicpc.net/problem/1193 - 분수찾기

import java.util.Scanner;

public class P1193 {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        int n = 0;
        int k;
        int a;
        int b;
        k = in.nextInt();
        while(i<k) {
            i += ++n;
        }
        if(n%2==0) {
            a = n-i+k;
            b = i-k+1;
        } else {
            a = i-k+1;
            b = n-i+k;
        }
        System.out.printf("%d/%d",a,b);
    }
}

