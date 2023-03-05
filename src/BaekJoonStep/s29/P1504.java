package BaekJoonStep.s29;
//https://www.acmicpc.net/problem/1504 - 특정한 최단 경로

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P1504 {
    static int v, e, x, y;
    static final int MAX = Integer.MAX_VALUE;
    static int[] d;
    static List<Node>[] list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        list = new ArrayList[v+1];
        d = new int[v+1];
        for (int i = 1; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }

        while(e-->0) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            list[v1].add(new Node(v2, w));
            list[v2].add(new Node(v1, w));
        }
        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        boolean b0 = false, b1 = false;

        clear(1);
        dijkstra(1);
        if(d[x]==MAX) b0 = true;
        if(d[y]==MAX) b1 = true;

        int a0 = d[x];  //1, x, y, N
        int a1 = d[y];  //1, y, x, N

        clear(x);
        dijkstra(x);
        if(d[y]==MAX) b0 = true;
        if(d[v]==MAX) b1 = true;
        a0 += d[y];
        a1 += d[v];

        clear(y);
        dijkstra(y);
        if(d[v]==MAX) b0 = true;
        if(d[x]==MAX) b1 = true;
        a0 += d[v];
        a1 += d[x];
        if(b0&&b1) {
            System.out.println(-1);
        } else if (b0) {
            System.out.println(a1);
        } else if (b1) {
            System.out.println(a0);
        } else {
            System.out.println(Math.min(a0,a1));
        }
    }
    public static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));

        while(pq.size()!=0) {
            Node cur = pq.poll();
            if(d[cur.v]<cur.w) continue;

            for (int i = 0; i < list[cur.v].size(); i++) {
                Node next = list[cur.v].get(i);
                if(d[next.v]>cur.w+next.w) {
                    d[next.v] = cur.w + next.w;
                    pq.add(new Node(next.v, d[next.v]));
                }
            }
        }
    }
    public static class Node implements Comparable<Node> {
        int v,w;
        Node(int v, int w) {
            this.v = v;
            this.w = w;
        }
        @Override
        public int compareTo(Node o) {
            return this.w - o.w;
        }
    }
    public static void clear(int start) {
        for (int i = 1; i < d.length; i++) {
            d[i] = MAX;
        }
        d[start] = 0;
    }
}
