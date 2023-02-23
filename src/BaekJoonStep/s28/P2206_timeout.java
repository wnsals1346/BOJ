package BaekJoonStep.s28;
//https://www.acmicpc.net/problem/2206 - 벽 부수고 이동하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2206_timeout {
    static int[][] map;
    static int X, Y, min = Integer.MAX_VALUE;
    static int[] dx = {-1,1,0,0}, dy = {0,0,-1,1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br. readLine());
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        map = new int[X][Y];
        for (int i = 0; i < X; i++) {
            int[] line = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < Y; j++) {
                map[i][j] = line[j];
            }
        }
        dfs(0, 0, false, 1);
        if(min==Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }


    }
    public static void dfs(int x, int y, boolean s, int dist) {
        if(map[x][y]==1 && s) {

        } else if(map[x][y]==1 && !s) {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(0<=nx && nx<X && 0<=ny && ny<Y) {
                    s = true;
                    dfs(nx, ny, s, dist+1);
                    s = false;
                }
            }

        } else if(x==X-1 && y==Y-1) {
            min = Math.min(min,dist);
        } else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(0<=nx && nx<X && 0<=ny && ny<Y) {
                    map[x][y] = 1;
                    dfs(nx, ny, s, dist+1);
                    map[x][y] = 0;
                }
            }
        }
    }

}
