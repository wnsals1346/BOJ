package BaekJoonStep.s28;
//https://www.acmicpc.net/problem/2667 - 단지번호붙이기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P2667 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
        int[] dx = {1,-1,0,0}, dy = {0,0,1,-1};

        for (int i = 0; i < n; i++) {
            String str =br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(str.split("")[j]);
            }
        }


        Queue<Cord> q = new LinkedList<>();
        int count = 0;
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(map[i][j]!=1) continue;
                q.add(new Cord(i,j));
                map[i][j] = 2;
                int houseNum = 1;

                while(q.size()!=0) {
                    Cord cur = q.poll();
                    for (int k = 0; k < 4; k++) {
                        int nx = cur.x+dx[k], ny = cur.y+dy[k];
                        if(0<=nx && nx<n && 0<=ny && ny<n) {
                            if(map[nx][ny]!=1) continue;
                            q.add(new Cord(nx,ny));
                            houseNum++; // 집 개수세기
                            map[nx][ny] = 2; // 방문은 2
                        }
                    }
                }
                res.add(houseNum);
                count++; // 단지세기
            }
        }
        Collections.sort(res);
        res.add(0,count);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < res.size(); i++) {
            sb.append(res.get(i)).append("\n");
        }
        System.out.println(sb);

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
