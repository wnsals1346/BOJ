package BaekJoonStep.s29;
//https://www.acmicpc.net/problem/1753 - 최단경로

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P1753 {
    static int v, e;
    static int[] d;
    static ArrayList<Node>[] list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(br.readLine());
        list = new ArrayList[v+1];
        for (int i = 1; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }

        d = new int[v+1];
        for (int i = 1; i < d.length; i++) {
            d[i] = Integer.MAX_VALUE;
        }
        d[start] = 0;

        while(e-->0) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            list[v1].add(new Node(v2, w));
        }

        dijkstra(start);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < d.length; i++) {
            if(d[i]==Integer.MAX_VALUE) {
                sb.append("INF").append("\n");
            } else {
                sb.append(d[i]).append("\n");
            }
        }
        System.out.print(sb);
    }
    public static void dijkstra(int start) {
        PriorityQueue<Node> q = new PriorityQueue<>();
        q.add(new Node(start, 0));

        while(q.size()!=0) {
            Node cur = q.poll();
            if(d[cur.v]<cur.w) continue; // 이미 경로를 수정했따면 다시 순회하지 않는다.

            for (int i = 0; i < list[cur.v].size(); i++) {
                Node next = list[cur.v].get(i);
                if(d[next.v] > next.w + cur.w) {
                    d[next.v] = next.w + cur.w;
                    q.add(new Node(next.v, d[next.v]));
                }
            }
        }
    }
    public static class Node implements Comparable<Node> {
        int v;
        int w;

        public Node(int v, int w) {
            this.v = v;
            this.w = w;
        }
        @Override //크기비교 해줘야됨
        public int compareTo(Node o) {
            return this.w - o.w;
        }
    }
}
