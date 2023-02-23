package BaekJoonStep.s19;
//https://www.acmicpc.net/problem/11659 - 구간 합 구하기 4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        st = new StringTokenizer(br.readLine());
        arr[1] = Integer.parseInt(st.nextToken());
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        int i, j;
        long sum;
        while(m-->0) {
            st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken())-1;
            j = Integer.parseInt(st.nextToken());
            sum = arr[j]-arr[i];
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
