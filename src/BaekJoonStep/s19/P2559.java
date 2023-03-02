package BaekJoonStep.s19;
//https://www.acmicpc.net/problem/2559 - 수열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        arr[0] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }
        int max = arr[m-1]; //초항
        for (int i = m; i < n; i++) {
            max = Math.max(max,arr[i]-arr[i-m]);
        }
        System.out.println(max);
    }
}
