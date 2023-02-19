package BaekJoonETC._2Silver;
//https://www.acmicpc.net/problem/24479 - 알고리즘 수업 - 깊이 우선 탐색 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P24479 {
    static List<Integer>[] list;
    static boolean[] visited;
    static int cnt;
    static int[] res;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        visited = new boolean[v+1];
        list = new ArrayList[v+1];
        res = new int[v+1];
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

        for (int i = 1; i < list.length; i++) {
            Collections.sort(list[i]);
        }


        dfs(start);

        for (int i = 1; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static void dfs(int v) {
        visited[v] = true;
        cnt++;
        res[v] = cnt; // 1260과 다른 지점 순서를 배열에 저장
        for (int i = 0; i < list[v].size(); i++) {
            if(visited[list[v].get(i)]) continue;
            dfs(list[v].get(i));
        }
    }
}
