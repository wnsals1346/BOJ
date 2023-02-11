package BaekJoonETC._2Silver;
//https://www.acmicpc.net/problem/11726 - 2×n 타일링

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        int[] dp = new int[c+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < c+1; i++) {
            dp[i] = (dp[i-1] + dp[i-2])%10007;
        }
        System.out.println(dp[c]);

    }
}
