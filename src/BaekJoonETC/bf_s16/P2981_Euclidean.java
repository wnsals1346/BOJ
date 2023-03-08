package BaekJoonETC.bf_s16;
//https://www.acmicpc.net/problem/2981 - 검문

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2981_Euclidean {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        int[] arr = new int[c];
        for (int i = 0; i < c; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        int gcd= arr[1]-arr[0];
        for (int i = 1; i < arr.length-1; i++) {
            gcd = gcd(gcd,arr[i+1]-arr[i]);
        }
        for (int i = 2; i <= gcd; i++) {
            if(gcd%i==0) sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
    static int gcd(int a, int b) {
        int r;
        while(b!=0) {
            r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
}
