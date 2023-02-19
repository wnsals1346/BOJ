package BaekJoonETC._2Silver;
//https://www.acmicpc.net/problem/2644 - 촌수계산

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P2644_other {
    static List<Integer>[] list;
    static boolean[] visited;
    static int res = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int v = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int from = Integer.parseInt(st.nextToken());
        int to = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(br.readLine());
        list = new ArrayList[v+1];
        for (int i = 1; i < list.length; i++) {  // 생성 꼭해줘야한다.
            list[i] = new ArrayList<>();
        }
        visited = new boolean[v+1];

        while(e-->0) {
            st = new StringTokenizer(br.readLine());
            int p1 = Integer.parseInt(st.nextToken());
            int p2 = Integer.parseInt(st.nextToken());
            list[p1].add(p2);
            list[p2].add(p1);
        }
        dfs(0,from,to);
        System.out.println(res);

    }
    static void dfs(int lvl, int v, int to) {
        if(v==to) {
            res = lvl;
            return;
        }
        visited[v] = true;
        for (int i = 0; i < list[v].size(); i++) {
            if(visited[list[v].get(i)]) continue;
            dfs(lvl+1, list[v].get(i), to);
        }
    }
}
