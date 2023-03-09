package BaekJoonStep.s29;
//https://www.acmicpc.net/problem/13549 - 숨바꼭질 3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P13549_noPath {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int point = 100001;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int[] d = new int[point];

        for (int i = 0; i < point; i++) {
            d[i] = Integer.MAX_VALUE;
        }



        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));
        d[start] = 0;
        while(pq.size()!=0) {
            Node cur = pq.poll();
            if(cur.v == end) break;
            if(d[cur.v]<cur.w) continue;

            if(cur.v==0 || cur.v==point-1) {
                if(cur.v==0) {
                    if(d[cur.v+1] > cur.w) {
                        d[cur.v+1] = cur.w+1;
                        pq.add(new Node(cur.v+1, cur.w+1));
                    }
                } else {
                    if(d[cur.v-1] > cur.w) {
                        d[cur.v-1] = cur.w+1;
                        pq.add(new Node(cur.v-1, cur.w+1));
                    }
                }

            } else {
                if(cur.v*2<point) {
                    int next = cur.v*2;
                    if(d[next] > cur.w) {
                        d[next] = cur.w;
                        pq.add(new Node(next, cur.w));
                    }
                }
                if(d[cur.v-1] > cur.w) {
                    d[cur.v-1] = cur.w+1;
                    pq.add(new Node(cur.v-1, cur.w+1));
                }
                if(d[cur.v+1] > cur.w) {
                    d[cur.v+1] = cur.w+1;
                    pq.add(new Node(cur.v+1, cur.w+1));
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
