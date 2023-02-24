package BaekJoonStep.s06;
//https://www.acmicpc.net/problem/10812 - 바구니 순서 바꾸기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P10812 {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n+1];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }
        while(m-->0) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            rotate(i, j, k);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < arr.length; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
    public static void rotate(int i, int j, int k) {
        int[] front = Arrays.copyOfRange(arr, i, k);
        int[] rear = Arrays.copyOfRange(arr, k, j+1);
        for (int l = 0; l < rear.length; l++) {
            arr[i] = rear[l];
            i++;
        }
        for (int l = 0; l < front.length; l++) {
            arr[i] = front[l];
            i++;
        }

    }
}
