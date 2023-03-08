package BaekJoonStep.s17;
//https://www.acmicpc.net/problem/10844 - 쉬운 계단 수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10844 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n+1][10];
        for (int i = 1; i < 10; i++) {
            dp[1][i] = 1;
        }
        for (int i = 2; i <n+1; i++) {
            for (int j = 0; j < 10; j++) {
                if(j==0) {
                    dp[i][j] = dp[i-1][j+1];
                } else if (j==9) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1])%1000000000;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = (sum + dp[n][i])%1000000000;
        }
        System.out.println(sum);
    }
}
