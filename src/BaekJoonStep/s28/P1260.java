package BaekJoonStep.s28;
//https://www.acmicpc.net/problem/1260 - DFS와 BFS

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1260 {
    static int N, M, start;
    static boolean[] visited_dfs, visited_bfs;
    static List<Integer>[] list;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());
        list = new ArrayList[N+1];
        visited_bfs = new boolean[N+1];
        visited_dfs = new boolean[N+1];
        sb = new StringBuilder();
        for (int i = 1; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }
        while(M-->0) {
            st = new StringTokenizer(br.readLine());
            int v1  = Integer.parseInt(st.nextToken());
            int v2  = Integer.parseInt(st.nextToken());
            list[v1].add(v2);
            list[v2].add(v1);
        }
        for (int i = 1; i < list.length; i++) {
            Collections.sort(list[i]);
        }
        dfs(start);
        sb.append("\n");
        bfs(start);
        System.out.println(sb);


    }
    public static void dfs(int start) {
        visited_dfs[start] = true;
        sb.append(start).append(" ");
        for (int i = 0; i < list[start].size(); i++) {
            int v = list[start].get(i);
            if(!visited_dfs[v]) dfs(v);
        }
    }
    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited_bfs[start] = true;
        while(q.size()!=0) {
            int cur = q.poll();
            sb.append(cur).append(" ");
            for (int i = 0; i < list[cur].size(); i++) {
                int v = list[cur].get(i);
                if(!visited_bfs[v]) {
                    visited_bfs[v] = true;
                    q.add(v);
                }
            }
        }
    }

}
