package BaekJoonStep.s11;
//https://www.acmicpc.net/problem/10989 - 수정렬하기 3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] cnt = new int[10001];
        int n = Integer.parseInt(br.readLine());
        int idx;
        while(n-->0) {
            idx = Integer.parseInt(br.readLine());
            cnt[idx]++;
        }
        for(int i=1;i<cnt.length;i++) {
            if(cnt[i]==0) continue;
            while(cnt[i]>0) {
                cnt[i]--;
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}
