package BaekJoonStep.s28;
//https://www.acmicpc.net/problem/2606 - 바이러스

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P2606 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int v = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());
        List<Integer>[] list = new ArrayList[v+1];
        boolean[] visited = new boolean[v+1];
        StringTokenizer st;

        for (int i = 1; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }

        while(e-->0) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            list[v1].add(v2);
            list[v2].add(v1);
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        visited[1] = true;
        int res = 0;
        while(q.size()!=0) {
            int cur = q.poll();
            for (int i = 0; i < list[cur].size(); i++) {
                int com = list[cur].get(i);
                if(visited[com]) continue;
                visited[com] = true;
                q.add(com);
                res++;
            }
        }

        System.out.println(res);
    }
}
