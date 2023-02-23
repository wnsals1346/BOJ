package BaekJoonStep.s18;
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
                if(j==(i*(i+1)/2)) { //각 줄의 첫 숫자 선택지 X
                    dp[j] += dp[j-i];
                } else if (j==(i*(i+1)/2+i)) { //각 줄의 마지막 숫자 선택지 X
                    dp[j] += dp[j-(i+1)];
                } else {
                    dp[j] += Math.max(dp[j-i],dp[j-(i+1)]); //부모중 높은 숫자 택
                }
            }
        }
        int max = 0;
        for (int i = dp.length-n; i < dp.length; i++) { // 마지막줄 중에 최댓값 찾기
            max = Math.max(dp[i],max);
        }
        System.out.println(max);
    }
}