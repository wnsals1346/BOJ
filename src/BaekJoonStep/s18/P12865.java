package BaekJoonStep.s18;
//https://www.acmicpc.net/problem/12865 - 평범한 배낭

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12865 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int[][] dp = new int[n+1][w+1];
        int weight, value;
        for (int i = 1; i < n+1; i++) {
            st = new StringTokenizer(br.readLine());
            weight = Integer.parseInt(st.nextToken());
            value =  Integer.parseInt(st.nextToken());
            for (int j = 1; j < w+1; j++) {
                if(weight>j) {
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = Math.max(value+dp[i-1][j-weight],dp[i-1][j]);
                }
            }
        }
        System.out.println(dp[n][w]);
    }
}
