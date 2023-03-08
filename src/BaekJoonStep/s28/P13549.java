package BaekJoonStep.s28;
//https://www.acmicpc.net/problem/13549 - 숨바꼭질 3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P13549 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int point = 100001;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        List<Node>[] list = new ArrayList[point];
        int[] d = new int[point];

        for (int i = 0; i < point; i++) {
            d[i] = Integer.MAX_VALUE;
        }

        for (int i = 1; i < point-1; i++) {
            list[i] = new ArrayList<>();
            list[i].add(new Node(i-1, 1));
            list[i].add(new Node(i+1, 1));
            if(2*i<point) {
                list[i].add(new Node(2*i, 0));
            }
        }
        list[0] = new ArrayList<>();
        list[0].add(new Node(1, 1));
        list[point-1] = new ArrayList<>();
        list[point-1].add(new Node(point-2,1));

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));
        d[start] = 0;
        while(pq.size()!=0) {
            Node cur = pq.poll();
            if(d[cur.v]<cur.w) continue;
            for (int i = 0; i < list[cur.v].size(); i++) {
                Node next = list[cur.v].get(i);
                if(d[next.v]> cur.w + next.w) {
                    d[next.v] = cur.w + next.w;
                    pq.add(new Node(next.v, d[next.v]));
                }
            }
        }

        System.out.println(d[end]);

    }
    public static class Node implements Comparable<Node> {
        int v,w;

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
