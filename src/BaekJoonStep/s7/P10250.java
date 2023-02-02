package BaekJoonStep.s7;
//https://www.acmicpc.net/problem/10250 - ACM호텔

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10250 {
    public static void main(String[] agrs) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(;n>0;n--) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int ans;
            if(p%h!=0) {
                ans = (p%h)*100+p/h+1;
            } else {
                ans = h*100+p/h;
            }
            System.out.println(ans);
        }
    }
}

