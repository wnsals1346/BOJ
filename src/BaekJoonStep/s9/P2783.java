package BaekJoonStep.s9;
//https://www.acmicpc.net/problem/2738 - 행렬 덧셈

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2783 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[][] ans = new int[m][n];
        boolean flag = false;

        do {
            for(int i=0;i<m;i++) {
                st = new StringTokenizer(br.readLine());
                for(int j=0;j<n;j++) {
                    ans[i][j] += Integer.parseInt(st.nextToken());
                }
            }
            flag = !flag;
        }while(flag);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                sb.append(ans[i][j]);
                if(j!=n-1) {
                    sb.append(' ');
                } else {
                    sb.append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}
