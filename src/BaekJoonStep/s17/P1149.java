package BaekJoonStep.s17;
//https://www.acmicpc.net/problem/1149 - RGB거리

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        int[][] dp = new int[c+1][3];
        StringTokenizer st;
        dp[0][0] = dp[0][1] = dp[0][2] = 0;
        for (int i = 1; i < c+1; i++) { //각 단계에서 3가지 선택의 최댓값을 모두 저장
            st = new StringTokenizer(br.readLine());
            dp[i][0] = Integer.parseInt(st.nextToken()) + Math.min(dp[i-1][1], dp[i-1][2]);
            dp[i][1] = Integer.parseInt(st.nextToken()) + Math.min(dp[i-1][0], dp[i-1][2]);
            dp[i][2] = Integer.parseInt(st.nextToken()) + Math.min(dp[i-1][0], dp[i-1][1]);
        }
        int res = Math.min(dp[c][0], Math.min(dp[c][1], dp[c][2]));
        System.out.println(res);
    }

}
