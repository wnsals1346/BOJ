package BaekJoonStep.s28;
//https://www.acmicpc.net/problem/1012 - 유기농 배추

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int N, M, e;
        int[] dx = {-1,1,0,0}, dy = {0,0,-1,1};
        int[][] map;
        while(t-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            map = new int[N][M];
            e = Integer.parseInt(st.nextToken());


            while(e-->0) {
                st = new StringTokenizer(br.readLine());
                int y = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());
                map[x][y] = 1;
            }

            Queue<Cord> q = new LinkedList<>();
            int res = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if(map[i][j]!=1) continue;
                    q.add(new Cord(i,j));
                    map[i][j] = 0;

                    while(q.size()!=0) {
                        Cord cur = q.poll();
                        for (int k = 0; k < 4; k++) {
                            int nx = cur.x + dx[k];
                            int ny = cur.y + dy[k];
                            if(0<=nx && nx<N && 0<=ny && ny<M) {
                                if(map[nx][ny]!=1) continue;
                                q.add(new Cord(nx,ny));
                                map[nx][ny] = 0;
                            }
                        }
                    }
                    res++;
                }
            }
            System.out.println(res);
        }
    }

    public static class Cord {
        int x;
        int y;

        public Cord(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
