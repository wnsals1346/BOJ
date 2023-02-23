package BaekJoonStep.s04;
//https://www.acmicpc.net/problem/10811 - 바구니 뒤집기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+1];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }
        while(M-->0) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            reverse(arr, i, j);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < arr.length; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.print(sb);
    }
    public static void reverse(int[] arr, int i, int j) {
        int[] tarr = Arrays.copyOfRange(arr,i,j+1);
        for (int k = 0; k < tarr.length/2; k++) {
            int temp = tarr[k];
            tarr[k] = tarr[tarr.length-1-k];
            tarr[tarr.length-1-k] = temp;
        }
        int l = 0;
        for (int k = i; k < j+1; k++) {
            arr[k] = tarr[l++];
        }
    }
}
