package BaekJoonStep.s16;
//https://www.acmicpc.net/problem/14889 - 스타트와 링크

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14889_new {
    static int[][] point;
    static boolean[] visit;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        point = new int[N][N];
        visit = new boolean[N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                point[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        sol(0, N,0);
        System.out.println(min);
    }
    public static void sol(int start, int n, int k) {
        if(k==n/2) {
            min = Math.min(min, diff());
        }
        else {
            for (int i = start; i < n; i++) {
                if(visit[i]) continue;
                visit[i] = true;
                sol(i+1, n,k+1);
                visit[i] = false;
            }
        }
    }
    public static int diff() {
        int s1 = 0, s2 = 0, diff;
        for (int i = 0; i < visit.length-1; i++) {
            for (int j = i+1; j < visit.length; j++) {
                if(visit[i]&&visit[j]) s1 += point[i][j] + point[j][i];
                else if ((!visit[i])&&(!visit[j])) s2 += point[i][j] + point[j][i];
            }
        }
        diff = Math.abs(s1-s2);
        if(diff == 0) {
            System.out.println(diff);
            System.exit(0);
        }
        return diff;
    }
}
