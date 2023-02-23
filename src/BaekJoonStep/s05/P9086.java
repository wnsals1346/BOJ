package BaekJoonStep.s05;
//https://www.acmicpc.net/problem/9086 - 문자열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(n-->0) {
            String str = br.readLine();
            sb.append(str.charAt(0)).append(str.charAt(str.length()-1)).append("\n");
        }
        System.out.println(sb);
    }
}
