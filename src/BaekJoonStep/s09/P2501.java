package BaekJoonStep.s09;
//https://www.acmicpc.net/problem/2501 - 약수 구하기

import java.util.Scanner;

public class P2501 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0) {
                cnt++;
                if(cnt==k) {
                    System.out.println(i);
                    System.exit(0);
                }
            }
        }
        System.out.println(0);
    }
}
