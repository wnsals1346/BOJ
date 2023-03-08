package BaekJoonStep.s17;
//https://www.acmicpc.net/problem/1912 - 연속합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dp = new int[n+1];
        int res = -1000;
        for (int i = 1; i < n+1; i++) {
            dp[i] = Integer.parseInt(st.nextToken());
            dp[i] = Math.max(dp[i],dp[i-1]+dp[i]);
            res = Math.max(dp[i],res);
        }
        System.out.println(res);
    }
}
