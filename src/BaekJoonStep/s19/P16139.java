package BaekJoonStep.s19;
//https://www.acmicpc.net/problem/16139 - 인간-컴퓨터 상호작용

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P16139 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int q = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        int[][] arr = new int[26][str.length()];
        boolean[] al = new boolean[26];

        while(q-->0) {
            String[] s = br.readLine().split(" ");
            int alpha = s[0].charAt(0);
            if(!al[alpha-'a']) {
                al[alpha-'a'] = true;
                arr[alpha-'a'][0] = str.charAt(0)==alpha?1:0;
                for (int i = 1; i < arr[0].length; i++) {
                    arr[alpha-'a'][i] = arr[alpha-'a'][i-1] + (str.charAt(i)==alpha?1:0);
                }
            }

            int s1 = Integer.parseInt(s[1]);
            int s2 = Integer.parseInt(s[2]);
            if(s1==0) sb.append(arr[alpha-'a'][s2]).append("\n");
            else sb.append(arr[alpha-'a'][s2]-arr[alpha-'a'][s1-1]).append("\n");
        }
        System.out.print(sb);
    }
}
