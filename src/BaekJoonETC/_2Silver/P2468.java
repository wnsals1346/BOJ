package BaekJoonETC._2Silver;
//https://www.acmicpc.net/problem/2468 - 안전 영역

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2468 {
    static int n;
    static int[][] map;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n][n];
        StringTokenizer st;
        int maxHeight = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                maxHeight = Math.max(maxHeight,map[i][j]);
            }
        }

        int res = 0;
        for (int height = 0; height < maxHeight; height++) {
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(visited[i][j] || map[i][j]<=height) continue;
                    dfs(i,j,height);
                    cnt++;
                }
            }
            visited = new boolean[n][n];
            res = Math.max(res,cnt);
        }
        System.out.println(res);

    }

    /*
        행렬을 돌면서 dfs로 인접행렬을 순회한다.
        행렬 진입 X 조건 ,  visited, 높이<=h 인덱스 범위 밖
        진입 순서는 동쪽부터 시계방향
        끝나는 순간 : 이미 방문한 상태에서 더이상 갈 곳이 없음. -> cnt++
     */

    public static void dfs(int x, int y, int h) {
        if(visited[x][y] || map[x][y]<=h) {
            return;
        } else {
            visited[x][y] = true;
            if(y!=n-1) {
                dfs(x,y+1,h);
            }
            if(x!=n-1) {
                dfs(x+1,y,h);
            }
            if(y!=0) {
                dfs(x,y-1,h);
            }
            if(x!=0) {
                dfs(x-1,y,h);
            }
        }
    }

}