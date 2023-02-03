package BaekJoonStep.s15;
//https://www.acmicpc.net/problem/1010 - 다리 놓기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (c-- > 0) {
            st = new StringTokenizer(br.readLine());
            sb.append(sol(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()))).append("\n");
        }
        System.out.println(sb);
    }

    public static int sol(int k, int n) {
        int[][] dp = new int[n + 1][k + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < k + 1; i++) {
            dp[i][i] = 1;
        }
        for (int i = 2; i < n + 1; i++) {
            for (int j = 1; j < k + 1; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
            }
        }
        return dp[n][k];
    }
}
