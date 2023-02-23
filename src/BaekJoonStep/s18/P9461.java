package BaekJoonStep.s18;
//https://www.acmicpc.net/problem/9461 - 파도반 수열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        int n;
        long[] f = new long[100];
        f[0] = f[1] = f[2] = 1;
        f[3] = f[4] = 2;
        for (int i = 5; i < f.length; i++) {
            f[i] = f[i-1] + f[i-5];
        }


        StringBuilder sb = new StringBuilder();
        while(c-->0) {
            n = Integer.parseInt(br.readLine());
            sb.append(f[n-1]).append("\n");
        }
        System.out.println(sb);

    }
}
