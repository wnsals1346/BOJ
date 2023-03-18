package BaekJoonETC._3Gold;
//https://www.acmicpc.net/problem/15686 - 치킨 배달

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P15686 {
    static int N, M;
    static int[] shop;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        shop = new int[M];
        map = new int[N][N];
        PriorityQueue<Chicken> pq = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(map[i][j]==2) pq.add(calHtoS(i,j));
            }
        }

        while(pq.size()>M) {
            Chicken cur = pq.poll();
            map[cur.x][cur.y] = 0;
        }
        for (int i = 0; i < map.length; i++) {
            System.out.println(Arrays.toString(map[i]));
        }
        int dist = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(map[i][j]==1) {
                    dist += calStoH(i,j);
                }
            }
        }
        System.out.println(dist);
    }
    public static Chicken calHtoS(int x, int y) {
        int dist = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(map[i][j]==1) {
                    dist += Math.abs(x-i)+Math.abs(y-j);
                }
            }
        }
        return new Chicken(x,y,dist);
    }
    public static int calStoH(int x, int y) {
        int dist = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(map[i][j]==2) {
                    dist = Math.min(dist,Math.abs(x-i)+Math.abs(y-j));
                }
            }
        }
        return dist;
    }

    public static class Chicken implements Comparable<Chicken> {
        int x,y,d;

        public Chicken(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }

        @Override
        public int compareTo(Chicken o) {
            return o.d - this.d;
        }
    }
}
