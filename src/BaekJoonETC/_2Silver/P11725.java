package BaekJoonETC._2Silver;
//https://www.acmicpc.net/problem/11725 - 트리의 부모 찾기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P11725 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int vertex = Integer.parseInt(br.readLine());
        int[][] matrix = new int[vertex][vertex];
        int[] res = new int[vertex];
        boolean[] visited = new boolean[vertex];
        StringTokenizer st;

        while(vertex-->1) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken())-1;
            int to = Integer.parseInt(st.nextToken())-1;
            matrix[from][to] = matrix[to][from] = 1;
        }

        ArrayList<Integer> queue = new ArrayList<>();
        queue.add(0);
        visited[0] = true;

        while(queue.size()!=0) {
            int cur = queue.remove(0);
            for (int i = 0; i < matrix.length; i++) {
                if(matrix[cur][i]==1 && !visited[i]) {
                    queue.add(i);
                    res[i] = cur+1;  // 현재 부모를 배열에 저장
                    visited[i] = true;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < res.length; i++) {
            sb.append(res[i]).append("\n");
        }
        System.out.println(sb);
    }
}
