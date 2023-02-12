package BaekJoonETC._2Silver;
//https://www.acmicpc.net/problem/14501 - 퇴사

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14501_better {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];
        StringTokenizer st;
        int day, pay;
        for (int i = 1; i < n+1; i++) {
            st = new StringTokenizer(br.readLine());
            day = Integer.parseInt(st.nextToken());
            pay = Integer.parseInt(st.nextToken());
            if(i+day-1<n+1) {
                dp[i+day-1] = Math.max(dp[i+day-1], pay + dp[i-1]);
            }

            dp[i] = Math.max(dp[i], dp[i-1]);
        }
        System.out.println(dp[n]);
    }
}
