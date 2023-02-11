package BaekJoonETC._2Silver;
//https://www.acmicpc.net/problem/15966 - 군계일학

import java.io.*;
import java.util.StringTokenizer;

public class P15966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dp = new int[1000001];
        int num;
        int max = 0;
        while(n-->0) {
            num = Integer.parseInt(st.nextToken());
            dp[num] = Math.max(dp[num-1]+1,1);
            max = Math.max(dp[num],max);
        }
        bw.write(String.valueOf(max));
        bw.close();
    }
}
