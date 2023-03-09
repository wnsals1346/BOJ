package BaekJoonStep.s18;
//https://www.acmicpc.net/problem/11053 - 가장 긴 증가하는 부분 수열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dp = new int[t+1];
        int[] val = new int[t+1];
        int res = 0;
        for (int i = 1; i < dp.length; i++) {
            val[i] = Integer.parseInt(st.nextToken());
            for (int j = 0; j < i; j++) {
                if(val[i]>val[j] && dp[i]==dp[j]){
                    dp[i] = dp[j]+1;
                    res = Math.max(res,dp[i]);
                }
            }
        }
        System.out.println(res);
    }
}