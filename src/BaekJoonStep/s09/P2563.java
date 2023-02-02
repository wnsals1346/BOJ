package BaekJoonStep.s09;
//https://www.acmicpc.net/problem/2563 - 색종이

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2563 {
    public static void main(String[] args) throws IOException {
        boolean[][] paper = new boolean[100][100];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 0;
        while(n-->0) {
            String loc = br.readLine();
            int x = Integer.parseInt(loc.split(" ")[0]);
            int y = Integer.parseInt(loc.split(" ")[1]);
            for(int i=x;i<x+10;i++) {
                for(int j=y;j<y+10;j++) {
                    if(paper[i][j]) continue;
                    paper[i][j] = true;
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
