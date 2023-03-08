package BaekJoonStep.s27;
//https://www.acmicpc.net/problem/2178 - 미로 탐색

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P2178 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] splits = br.readLine().split(" ");
        int N = Integer.parseInt(splits[0]);
        int M = Integer.parseInt(splits[1]);

        int[][] map = new int[N][M];
        int[] dx = {-1,1,0,0}, dy = {0,0,-1,1};
        for (int i = 0; i < N; i++) {
            String str =br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = Character.getNumericValue(str.charAt(j));
            }
        }

        Queue<Cord> q = new LinkedList<>();
        q.add(new Cord(0,0,1));
        map[0][0] = 2;

        while(q.size()!=0) {
            Cord cur = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
                if(nx==N-1 && ny==M-1) {
                    System.out.println(cur.dist+1);
                    return;
                }
                if(0<=nx && nx<N && 0<=ny && ny<M) {
                    if(map[nx][ny]==1) {
                        q.add(new Cord(nx, ny, cur.dist+1));
                        map[nx][ny] = 2;
                    }
                }
            }
        }

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
