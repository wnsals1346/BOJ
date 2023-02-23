package BaekJoonStep.s18;
//https://www.acmicpc.net/problem/24416 - 알고리즘 수업 - 피보나치 수 1

import java.util.Scanner;

public class P24416 {
    static int re_cnt = 0;
    static int dp_cnt = 0;
    static int[] f = new int[41];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        recursiveFibo(n);
        dpFivo(n);
        System.out.println(re_cnt+" "+dp_cnt);
    }
    public static void recursiveFibo(int n) {
        if(n==1 || n==2) re_cnt++;
        else {
            recursiveFibo(n-1);
            recursiveFibo(n-2);
        }
    }
    public static void dpFivo(int n) {
        f[1] = f[2] = 1;
        for (int i = 3; i <= n; i++) {
            f[i] = f[i-1] + f[i-2];
            dp_cnt++;
        }
    }
}
