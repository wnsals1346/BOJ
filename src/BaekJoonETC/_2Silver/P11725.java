package BaekJoonETC._2Silver;
//https://www.acmicpc.net/problem/11725 - 트리의 부모 찾기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P11725 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int v = Integer.parseInt(br.readLine());
        List<Integer>[] list = new ArrayList[v+1];
        int[] res = new int[v+1];
        StringTokenizer st;
        for (int i = 1; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }

        while(v-->1) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            list[from].add(to);
            list[to].add(from);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        res[1] = 1;

        while(queue.size()!=0) {
            int cur = queue.poll();
            for (int i = 0; i < list[cur].size(); i++) {
                int next = list[cur].get(i);
                if(res[next]==0) {
                    queue.add(next);
                    res[next] = cur;  // 현재 부모를 배열에 저장
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < res.length; i++) {
            sb.append(res[i]).append("\n");
        }
        System.out.println(sb);
    }
}
