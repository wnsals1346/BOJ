package BaekJoonStep.s18;
//https://www.acmicpc.net/problem/1904 - 01타일

import java.util.Scanner;

public class P1904 {
    public static void main(String[] args) {
        int[] f = new int[1000001];
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        f[0] = f[1] = 1;
        for (int i = 2; i < n+1; i++) {
            f[i] = (f[i-1] + f[i-2])%15746;
        }
        System.out.println(f[n]);
    }
}
