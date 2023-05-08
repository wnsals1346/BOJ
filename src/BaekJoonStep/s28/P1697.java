package BaekJoonStep.s28;
//https://www.acmicpc.net/problem/1697 - 숨바꼭질

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1697 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean[] visited = new boolean[100001];
        Queue<Loc> q = new LinkedList<>();
        q.add(new Loc(N, 0));
        visited[N] = true;

        while(q.size()!=0) {
            Loc cur = q.poll();
            if(cur.now==M) {
                System.out.println(cur.time);
                return;
            }

            if(cur.now+1<=100000) {
                if(!visited[cur.now+1]) {
                    visited[cur.now+1] = true;
                    q.add(new Loc(cur.now+1, cur.time+1));
                }
            }
            if(cur.now-1>=0) {
                if(!visited[cur.now-1]) {
                    visited[cur.now-1] = true;
                    q.add(new Loc(cur.now-1, cur.time+1));
                }
            }
            if(cur.now*2<=100000) {
                if(!visited[cur.now*2]) {
                    visited[cur.now*2] = true;
                    q.add(new Loc(cur.now*2, cur.time+1));
                }
            }
        }
    }

    public static class Loc {
        int now, time;

        public Loc(int now, int time) {
            this.now = now;
            this.time = time;
        }


    }
}
