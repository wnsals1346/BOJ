package BaekJoonETC._3Gold;
//https://www.acmicpc.net/problem/13975 - 파일 합치기 3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P13975 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(c-->0) {
            int num = Integer.parseInt(br.readLine());
            PriorityQueue<Long> pq = new PriorityQueue<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(num-->0) {
                pq.add((long)Integer.parseInt(st.nextToken()));

            }
            long answer = 0;
            while(pq.size()>=2) {
                long sum = pq.poll()+pq.poll();
                answer += sum;
                pq.add(sum);
            }
            sb.append(answer).append("\n");
        }
        System.out.print(sb);
    }
}
