package BaekJoonStep.s19;
//https://www.acmicpc.net/problem/11047 - 동전 0

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int total = Integer.parseInt(st.nextToken());
        int[] coin = new int[n];
        int res = 0;

        for (int i = 0; i < n; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        for (int i = n-1; 0<=i; i--) {
            res += total/coin[i];
            total %= coin[i];
        }
        System.out.println(res);
    }
}
