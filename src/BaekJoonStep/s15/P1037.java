package BaekJoonStep.s15;
//https://www.acmicpc.net/problem/1037 - 약수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] factor = new int[n];
        for (int i = 0; i < n; i++) {
            factor[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(factor);
        int ans;
        if(n%2==0) ans = factor[0]*factor[n-1];
        else ans = factor[n/2]*factor[n/2];
        System.out.println(ans);
    }
}
