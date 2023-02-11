package BaekJoonETC._2Silver;
//https://www.acmicpc.net/problem/14501 - 퇴사

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P14501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n+1][n+1];
        StringTokenizer st;
        int day, pay;
        for (int i = 1; i < dp.length; i++) {
            st = new StringTokenizer(br.readLine());
            day = Integer.parseInt(st.nextToken());
            pay = Integer.parseInt(st.nextToken());
            for (int j = i; j < dp[0].length; j++) {
                if(day+i-1>j) dp[i][j] = dp[i-1][j];
                else {
                    dp[i][j] = Math.max(dp[i-1][j], pay+dp[i-1][i-1]);
                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
        System.out.println(dp[n][n]);
    }
}