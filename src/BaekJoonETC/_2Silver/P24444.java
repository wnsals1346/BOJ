package BaekJoonETC._2Silver;
//https://www.acmicpc.net/problem/24444 - 알고리즘 수업 - 너비 우선 탐색 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P24444 {
    static List<Integer>[] list;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        visited = new boolean[v+1];
        list = new ArrayList[v+1];
        int[] res = new int[v+1];
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

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        int cnt = 0;
        res[start] = ++cnt;
        while(queue.size()!=0) {
            int cur = queue.poll();
            for (int i = 0; i < list[cur].size(); i++) {
                if(visited[list[cur].get(i)]) continue;
                queue.add(list[cur].get(i));
                visited[list[cur].get(i)] = true;
                cnt++;
                res[list[cur].get(i)] = cnt;
            }
        }

        for (int i = 1; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }

}
