package BaekJoonStep.s27;
//https://www.acmicpc.net/problem/7576 - 토마토

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P7576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[][] box = new int[N][M];
        int[] dx = {-1,1,0,0}, dy = {0,0,-1,1};
        Queue<Tomato> q = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int tomato = Integer.parseInt(st.nextToken());
                box[i][j] = tomato;
                if(tomato==1) {
                    q.add(new Tomato(i,j,0));
                }
            }
        }

        int today = 0;
        while(q.size()!=0) {
            Tomato cur = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
                if(0<=nx && nx<N && 0<=ny && ny<M) {
                    if(box[nx][ny]==0) {
                        q.add(new Tomato(nx,ny,cur.day+1));
                        box[nx][ny]=1;
                    }
                }
            }
            today = cur.day;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(box[i][j]==0) {
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(today);
    }
    public static class Tomato {
        int x;
        int y;
        int day;

        public Tomato(int x, int y, int day) {
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }
}
