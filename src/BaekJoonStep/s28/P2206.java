package BaekJoonStep.s28;
//https://www.acmicpc.net/problem/2206 - 벽 부수고 이동하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2206 {
    static int[][][] map;
    static int X, Y;
    static int[] dx = {-1,1,0,0}, dy = {0,0,-1,1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br. readLine());
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        map = new int[X][Y][2];  // 벽을 안부순 경우 0, 벽을 부순 경우 1 따로 체크한다.
        for (int i = 0; i < X; i++) {
            int[] line = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < Y; j++) {
                map[i][j][0] = line[j];
                map[i][j][1] = line[j];
            }
        }

        Queue<Cord> q = new LinkedList<>();
        q.add(new Cord(0,0,false, 1));
        map[0][0][0] = 1;
        map[0][0][1] = 1;

        while(q.size()!=0) {
            Cord cur = q.poll();
            if(cur.x==X-1 && cur.y==Y-1) {
                System.out.println(cur.dist);
                System.exit(0);
            }
            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if(0<=nx && nx<X && 0<=ny && ny<Y) {
                    if(cur.skill) {
                        if(map[nx][ny][1]==1) continue;
                        map[nx][ny][1] = 1;
                        q.add(new Cord(nx, ny, true, cur.dist+1));
                    } else {
                        if(map[nx][ny][0]==0) {
                            map[nx][ny][0] = 1;
                            q.add(new Cord(nx, ny, false, cur.dist+1));
                        } else {
                            q.add(new Cord(nx, ny, true, cur.dist+1));
                        }
                    }

                }
            }
        }
        System.out.println(-1);

    }
    public static class Cord {
        int x;
        int y;
        boolean skill;
        int dist;

        Cord(int x, int y, boolean skill, int dist) {
            this.x = x;
            this.y = y;
            this.skill = skill;
            this.dist = dist;
        }
    }

}
