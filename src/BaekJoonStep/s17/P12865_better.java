package BaekJoonStep.s17;
//https://www.acmicpc.net/problem/12865 - 평범한 배낭

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12865_better {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int[] dp = new int[w+1];
        int weight, value;
        while(n-->0) {
            st = new StringTokenizer(br.readLine());
            weight = Integer.parseInt(st.nextToken());
            value = Integer.parseInt(st.nextToken());
            for (int i = w; i > 0; i--) {
                if(weight>i) continue;
                dp[i] = Math.max(dp[i], value+dp[i-weight]);
            }
        }
        System.out.println(dp[w]);
    }
}
