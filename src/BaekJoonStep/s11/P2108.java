package BaekJoonStep.s11;
//https://www.acmicpc.net/problem/2108 - 통계학

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] cnt = new int[8001];
        int n = Integer.parseInt(br.readLine());
        int[] sortedarr = new int[n];
        int sum = 0;
        int idx;
        while(n-->0) {
            idx = Integer.parseInt(br.readLine());
            cnt[idx+4000]++;
            //frq_max = Math.(frq_max,cnt[idx+4000]) 미리 최대빈도수를 찾아놓고 나중에 같은 수를 찾는 방법
            sum += idx;
        }
        int frq_max = 0, val = 0;
        boolean sec = false;
        int j = 0;
        for(int i=0;i<cnt.length;i++) {
            if(cnt[i]==0) continue;
            if(cnt[i]>frq_max) {
                frq_max = cnt[i];
                val = i;
                sec = true;
            } else if(cnt[i]==frq_max && sec) {
                sec = false;
                val = i;
            }
            while(cnt[i]>0) {
                cnt[i]--;
                sortedarr[j++] = i-4000;
            }
        }
        sb.append(Math.round((double)sum/sortedarr.length)).append("\n");
        sb.append(sortedarr[sortedarr.length/2]).append("\n");
        sb.append(val-4000).append("\n");
        sb.append(sortedarr[sortedarr.length-1]-sortedarr[0]);
        System.out.println(sb);
    }
}
