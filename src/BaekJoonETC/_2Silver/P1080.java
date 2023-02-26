package BaekJoonETC._2Silver;
//https://www.acmicpc.net/problem/1080 - 행렬

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1080 {
    static int[][] sol, ans;
    static int N, M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        sol = new int[N][M];
        ans = new int[N][M];

        String[] line;
        for (int i = 0; i < N; i++) {
            line = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                sol[i][j] = Integer.parseInt(line[j]);
            }
        }

        for (int i = 0; i < N; i++) {
            line = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                ans[i][j] = Integer.parseInt(line[j]);
            }
        }
        if(check()) {
            System.out.println(0);
            return;
        }
        int count = 0;
        for (int i = 0; i < N-2; i++) {
            for (int j = 0; j < M-2; j++) {
                if(sol[i][j]!=ans[i][j]) {
                    reverse(i, j);
                    count++;
                    if(check()) {
                        System.out.println(count);
                        return;
                    }
                }
            }
        }
        System.out.println(-1);
    }
    public static void reverse(int i, int j) {

        for (int k = i; k < i+3; k++) {
            for (int l = j; l < j+3; l++) {
                if(sol[k][l]==0) sol[k][l] = 1;
                else sol[k][l] = 0;
            }
        }
    }
    public static boolean check() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(sol[i][j]!=ans[i][j]) return false;
            }
        }
        return true;
    }
}
