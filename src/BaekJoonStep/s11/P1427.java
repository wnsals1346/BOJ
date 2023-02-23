package BaekJoonStep.s11;
//https://www.acmicpc.net/problem/1427 - 소트인사이드

import java.io.IOException;

public class P1427 {
    public static void main(String[] args) throws IOException {
        int c = System.in.read();
        int[] cnt = new int[10];
        StringBuilder sb = new StringBuilder();
        while(c!=10) {
            cnt[c-48]++;
            c = System.in.read();
        }
        for(int i=cnt.length-1;i>=0;i--) {
            while(cnt[i]>0) {
                cnt[i]--;
                sb.append(i);
            }
        }
        System.out.println(sb);
    }
}