package BaekJoonETC._3Gold;
//https://www.acmicpc.net/problem/1916 - 최소비용 구하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P1916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        List<Node>[] list = new ArrayList[n+1];
        int[] d = new int[n+1];
        for (int i = 1; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 1; i < d.length; i++) {
            d[i] = Integer.MAX_VALUE;
        }
        while(m-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int price = Integer.parseInt(st.nextToken());
            list[start].add(new Node(end, price));
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        d[start] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));

        while(pq.size()!=0) {
            Node cur = pq.poll();
            if(d[cur.v]<cur.w) continue;
            for (int i = 0; i < list[cur.v].size(); i++) {
                Node next = list[cur.v].get(i);
                if(d[next.v]>cur.w + next.w) {
                    d[next.v] = cur.w + next.w;
                    pq.add(new Node(next.v, d[next.v]));
                }
            }
        }
        System.out.println(d[end]);

    }
    public static class Node implements Comparable<Node> {
        int v, w;

        public Node(int v, int w) {
            this.v = v;
            this.w = w;
        }
        @Override
        public int compareTo(Node o) {
            return this.w - o.w;
        }
    }
}
