package BaekJoonStep.s17;
//https://www.acmicpc.net/problem/1932 - 정수 삼각형

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n*(n+1)/2];
        dp[0] = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = i*(i+1)/2; j <=i*(i+1)/2+i ; j++) {
                dp[j] = Integer.parseInt(st.nextToken());
                if(j==(i*(i+1)/2)) {
                    dp[j] += dp[j-i];
                } else if (j==(i*(i+1)/2+i)) {
                    dp[j] += dp[j-(i+1)];
                } else {
                    dp[j] += Math.max(dp[j-i],dp[j-(i+1)]);
                }
            }
        }
        int max = 0;
        for (int i = dp.length-n; i < dp.length; i++) {
            max = Math.max(dp[i],max);
        }
        System.out.println(max);
    }
}
