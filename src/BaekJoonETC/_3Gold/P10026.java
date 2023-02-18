package BaekJoonETC._3Gold;
//https://www.acmicpc.net/problem/10026 - 적록색약

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10026 {
    static char[][] map;
    static boolean[][] visited;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j);
            }
        }

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(visited[i][j]) continue;
                dfs(i,j,map[i][j]);
                cnt++;
            }
        }
        visited = new boolean[N][N];
        int cntRG = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(visited[i][j]) continue;
                dfsRG(i,j,map[i][j]);
                cntRG++;
            }
        }
        System.out.println(cnt+" "+cntRG);

    }

    public static void dfs(int i, int j, char color) {
        if(color!=map[i][j] || visited[i][j]) {
            return;
        }
        visited[i][j] = true;
        if(j!=N-1) dfs(i,j+1, map[i][j]);
        if(i!=N-1) dfs(i+1,j, map[i][j]);
        if(j!=0) dfs(i,j-1, map[i][j]);
        if(i!=0) dfs(i-1,j, map[i][j]);
    }
    public static void dfsRG(int i, int j, char color) {
        if(color=='B') {
            if(color!=map[i][j] || visited[i][j]) {
                return;
            }
        } else {
            if(map[i][j]=='B' || visited[i][j]) {
                return;
            }
        }

        visited[i][j] = true;
        if(j!=N-1) dfsRG(i,j+1, map[i][j]);
        if(i!=N-1) dfsRG(i+1,j, map[i][j]);
        if(j!=0) dfsRG(i,j-1, map[i][j]);
        if(i!=0) dfsRG(i-1,j, map[i][j]);
    }
}
