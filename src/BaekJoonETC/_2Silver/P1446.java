package BaekJoonETC._2Silver;
//https://www.acmicpc.net/problem/1446 - 지름길

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1446 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int e = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        List<Node> pq = new ArrayList<>();
        int[] d = new int[v+1];
        for (int i = 0; i < d.length; i++) {
            d[i] = i;
        }
        while(e-->0) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int dist = Integer.parseInt(st.nextToken());
            if(end>v) continue;
            pq.add(new Node(start, end, dist));
        }

        Collections.sort(pq);
        int end = 1;
        while(pq.size()!=0) {
            Node cur = pq.remove(0);
            if(cur.from!=0) {  // 지름길을 사용하기직전까지 최단거리 갱신
                for (int i = end; i <= cur.from; i++) {
                    if(d[i]>d[i-1]+1) d[i] = d[i-1]+1;
                }
                end = cur.from;
            }

            if(d[cur.to]>d[cur.from]+cur.w) {
                d[cur.to] = d[cur.from]+cur.w;
            }

        }
        for (int i = end; i < d.length; i++) { //마지막 지름길 확인 후 최단거리 갱신
            if(d[i]>d[i-1]+1) d[i] = d[i-1]+1;
        }
        System.out.println(d[v]);

    }
    public static class Node implements Comparable<Node> {
        int from, to;
        int w;

        public Node(int from, int to, int w) {
            this.from = from;
            this.to = to;
            this.w = w;
        }

        @Override
        public int compareTo(@NotNull Node o) {
            return this.from-o.from;
        }
    }
}
