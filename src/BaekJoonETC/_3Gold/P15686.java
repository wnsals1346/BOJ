package BaekJoonETC._3Gold;
//https://www.acmicpc.net/problem/15686 - 치킨 배달

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P15686 {
    static int N, M, ans;
    static Cord[] shop;
    static int[][] map, visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        ans = Integer.MAX_VALUE;
        shop = new Cord[M];
        map = new int[N][N];
        visited = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0);
        System.out.println(ans);
    }
    public static void dfs(int lvl) {
        if(lvl==M) {
            ans = Math.min(ans, calc());
        } else {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(map[i][j]==2 && visited[i][j]==0) {
                        shop[lvl] = new Cord(i, j);
                        visited[i][j] = 1;
                        dfs(lvl+1);
                        visited[i][j] = 0;
                    }
                }
            }
        }
    }

    public static int calc() {
        int res = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(map[i][j]==1) {
                    int min = 100;
                    for (Cord c : shop) {
                         min = Math.min(min, Math.abs(i-c.x) + Math.abs(j-c.y));
                    }

                    res += min;
                }
            }
        }
        return res;
    }

    public static class Cord {
        int x,y;

        public Cord(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public String toString() {
            return "["+this.x+", "+this.y+"]";
        }
    }
}
