package BaekJoonStep.s16;
//https://www.acmicpc.net/problem/15649 - N과 M (1)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P15649 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[m];
        nAndMOne(arr, n, 0);
        System.out.println(sb);

    }
    public static void nAndMOne(int[] arr, int n, int lv) {
        if(lv==arr.length) { //lv is from 0
            for (int i = 0; i < arr.length-1; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append(arr[arr.length-1]).append("\n");

        } else {
            for (int i = 1; i <= n; i++) {
                arr[lv] = i;
                if(check(arr, i, lv)) nAndMOne(arr, n, lv+1);
            }
        }
    }
    public static boolean check(int[] arr, int n, int lv) {
        for (int i = 0; i < lv; i++) {
            if(arr[i]==n) return false;
        }
        return true;
    }
}
