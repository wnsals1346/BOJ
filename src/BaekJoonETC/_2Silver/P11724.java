package BaekJoonETC._2Silver;
//https://www.acmicpc.net/problem/11724 - 연결 요소의 개수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P11724 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int vertex = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());

        boolean[] visited = new boolean[vertex];
        int[][] graph = new int[vertex][vertex];


        while(edge-->0) { //undirected graph (adjacency matrix)
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken())-1; //index
            int to = Integer.parseInt(st.nextToken())-1;
            graph[from][to] = graph[to][from] = 1;
        }

        Queue<Integer> queue = new LinkedList<>();
        int cnt = 0;
        for (int i = 0; i < vertex; i++) { //정점 순회하며 찾기
            if(visited[i]) continue; // 방문안한 정점일 경우에만 bfs 진행
            queue.add(i);
            visited[i] = true;

            while(queue.size()!=0) {
                int cur = queue.remove();
                for (int j = 0; j < vertex; j++) {
                    if(graph[cur][j]!=0 && !visited[j]) {
                        queue.add(j);
                        visited[j] = true;
                    }
                }
            }
            cnt++; //한 연결요소를 찾으면 ++
        }
        System.out.println(cnt);
    }
}
