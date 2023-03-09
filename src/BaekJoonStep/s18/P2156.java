package BaekJoonStep.s18;
//https://www.acmicpc.net/problem/2156 - 포도주 시식

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] dp = new int[t+1];
        int[] val = new int[t+1];
        dp[1] = Integer.parseInt(br.readLine());
        if(t==1) {
            System.out.println(dp[1]);
            System.exit(0);
        }
        val[2] = Integer.parseInt(br.readLine());
        dp[2] = dp[1] + val[2];

        for (int i = 3; i < t+1; i++) {
            val[i] = Integer.parseInt(br.readLine());
            dp[i] = Math.max(dp[i-1], Math.max(val[i]+dp[i-2], val[i]+val[i-1]+dp[i-3]));
        }
        System.out.println(dp[t]);
    }
}
