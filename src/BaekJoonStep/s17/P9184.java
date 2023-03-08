package BaekJoonStep.s17;
//https://www.acmicpc.net/problem/9184 - 신나는 함수 실행

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P9184 {
    static int[][][] abc = new int[21][21][21];
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < 21; j++) {
                for (int k = 0; k < 21; k++) {
                    if(i==0 || j==0 || k==0) abc[i][j][k] = 1;
                    else if(i<j && j<k) {
                        abc[i][j][k] = abc[i][j][k-1] + abc[i][j-1][k-1] - abc[i][j-1][k];
                    } else {
                        abc[i][j][k] = abc[i-1][j][k] + abc[i-1][j-1][k] + abc[i-1][j][k-1] - abc[i-1][j-1][k-1];
                    }
                }
            }
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        while(a!=-1||b!=-1||c!=-1) {
            sb.append("w(").append(a).append(", ").append(b).append(", ").append(c).append(") = ").append(w(a, b, c)).append("\n");
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
        }
        System.out.println(sb);
    }
    public static int w(int a, int b, int c) {
        if(a<=0 || b<=0 || c<=0) return abc[0][0][0];
        else if(a>20 || b>20 || c>20) return abc[20][20][20];
        else return abc[a][b][c];
    }
}
