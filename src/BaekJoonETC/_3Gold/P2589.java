package BaekJoonETC._3Gold;
//https://www.acmicpc.net/problem/2589 - 보물섬

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2589 {
    static int[] dx = {-1,1,0,0}, dy = {0,0,-1,1};
    static int N, M;
    static int[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];


        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                if(str.charAt(j)=='L') map[i][j] = 1;
                else map[i][j] = 0;
            }
        }

        int max = 0;
        Queue<Cord> q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(map[i][j]==0 || !isEdge(i,j)) continue;
                boolean[][] visited = new boolean[N][M];
                q.add(new Cord(i,j,0));
                visited[i][j] = true;

                while(q.size()!=0) {
                    Cord cur = q.poll();
                    max = Math.max(max,cur.dist);
                    for (int k = 0; k < 4; k++) {
                        int nx = cur.x + dx[k];
                        int ny = cur.y + dy[k];
                        if(0<=nx && nx<N && 0<=ny && ny<M) {
                            if(visited[nx][ny] || map[nx][ny]==0) continue;
                            q.add(new Cord(nx,ny,cur.dist+1));
                            visited[nx][ny] = true;
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
    public static boolean isEdge(int x, int y) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(0<=nx && nx<N && 0<=ny && ny<M) {
                if(map[nx][ny]==1) count++;
            }
        }
        return count == 1 || count == 2;
    }
    public static class Cord {
        int x;
        int y;
        int dist;

        public Cord(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
}
