package BaekJoonStep.s18;
//https://www.acmicpc.net/problem/2579 - 계단 오르기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];
        int[] val = new int[n+1];
        val[1] = Integer.parseInt(br.readLine());
        dp[1] = val[1];
        if(n==1) {
            System.out.println(dp[1]);
            return;
        }
        val[2] = Integer.parseInt(br.readLine());
        dp[2] = val[1] + val[2];

        for (int i = 3; i < dp.length; i++) {
            val[i] = Integer.parseInt(br.readLine());
            dp[i] = val[i] + Math.max(dp[i-2], dp[i-3]+val[i-1]);
        }
        System.out.println(dp[n]);
    }
}
