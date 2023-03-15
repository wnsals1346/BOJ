package BaekJoonETC._3Gold;
//https://www.acmicpc.net/problem/4485 - 녹색 옷 입은 애가 젤다지?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P4485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String PROBLEM = "Problem ";
        int caseNum = 1;
        int[] dx = {-1,1,0,0}, dy = {0,0,-1,1};
        StringBuilder sb = new StringBuilder();
        int c = Integer.parseInt(br.readLine());
        while(c!=0) {
            int[][] map = new int[c][c];
            int[][] dist = new int[c][c];
            for (int i = 0; i < c; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < c; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                    dist[i][j] = Integer.MAX_VALUE;
                }
            }

            dist[0][0] = map[0][0];

            PriorityQueue<Cord> pq = new PriorityQueue<>();
            pq.add(new Cord(0,0,dist[0][0]));

            while(pq.size()!=0) {
                Cord cur = pq.poll();

                if(dist[cur.x][cur.y] < cur.w) continue;

                for (int i = 0; i < 4; i++) {
                    int nx = cur.x + dx[i];
                    int ny = cur.y + dy[i];
                    if(nx>=0 && nx<c && ny>=0 && ny<c) {
                        if(dist[nx][ny] > cur.w + map[nx][ny]) {
                            dist[nx][ny] = cur.w + map[nx][ny];
                            pq.add(new Cord(nx,ny,dist[nx][ny]));
                        }
                    }
                }
            }
            sb.append(PROBLEM).append(caseNum++).append(": ").append(dist[c-1][c-1]).append("\n");
            c = Integer.parseInt(br.readLine());
        }
        System.out.println(sb);
    }

    public static class Cord implements Comparable<Cord> {
        int x, y, w;

        public Cord(int x, int y, int w) {
            this.x = x;
            this.y = y;
            this.w = w;
        }
        @Override
        public int compareTo(Cord o) {
            return this.w - o.w;
        }
    }
}
