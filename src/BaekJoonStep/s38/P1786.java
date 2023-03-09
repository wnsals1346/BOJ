package BaekJoonStep.s38;
//https://www.acmicpc.net/problem/1786 - 찾기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1786 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String ptr = br.readLine();
        int sl = str.length(), pl = ptr.length();
        int[] t = makeTable(ptr);

        StringBuilder sb = new StringBuilder();
        int idx = 0,count = 0;
        for (int i = 0; i < sl; i++) {
            while(idx>0 && str.charAt(i)!=ptr.charAt(idx)) {
                idx = t[idx-1];
            }
            if(str.charAt(i)==ptr.charAt(idx)) {
                if(idx==pl-1) {
                    count++;
                    sb.append(i-idx+1).append(" ");
                    idx = t[idx];
                } else {
                    idx++;
                }
            }
        }

        System.out.println(count);
        System.out.println(sb);
    }
    public static int[] makeTable(String pattern) {
        int pl = pattern.length();
        int[] t = new int[pl];
        int idx = 0;
        for (int i = 1; i < pl; i++) {
            while(idx>0 && pattern.charAt(i)!=pattern.charAt(idx)) {
                idx = t[idx-1];
            }
            if(pattern.charAt(i)==pattern.charAt(idx)) {
                t[i] = ++idx;
            }
        }
        return t;
    }
}
