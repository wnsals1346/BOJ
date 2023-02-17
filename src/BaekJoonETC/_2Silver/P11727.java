package BaekJoonETC._2Silver;
//https://www.acmicpc.net/problem/11727 - 2×n 타일링 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11727 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];
        dp[0] = dp[1] = 1;

        for (int i = 2; i < dp.length; i++) {
            dp[i] = (dp[i-1] + 2*dp[i-2])%10007;
        }
        System.out.println(dp[n]);
    }
}
