package BaekJoonETC._2Silver;
//https://www.acmicpc.net/problem/1564 - 팩토리얼5

import java.util.Scanner;

public class P1564 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] f = new long[1000001];
        f[0] = 1;
        for (int i = 1; i <= n; i++) {
            f[i] = deleteZero(f[i-1]*i)%1000000000000L;
        }

        int res = (int)(f[n]%100000);
        StringBuilder sb = new StringBuilder();
        int z = 5-String.valueOf(res).length();
        sb.append("0".repeat(z)).append(res);
        System.out.println(sb);

    }
    public static long deleteZero(long num) {
        while(num>=10 && num%10==0) {
            num /= 10;
        }
        return num;
    }
}
