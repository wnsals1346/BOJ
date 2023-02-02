package BaekJoonStep.s4;
//https://www.acmicpc.net/problem/8958 - OX퀴즈

import java.io.*;

public class P8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int point = 0;
        int score = 0;

        for(int i=0;i<n;i++) {
            String[] ans = br.readLine().split("");

            for(int j=0;j<ans.length;j++) {
                point = (ans[j].equals("O"))?point+1:0;
                score += point;
            }
            bw.write(String.valueOf(score));
            bw.newLine();
            point = 0;
            score = 0;
        }
        br.close();
        bw.close();
    }
}
