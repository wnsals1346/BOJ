package BaekJoonStep.s25;
//https://www.acmicpc.net/problem/11279 - 최대 힙

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class P11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        while(c-->0) {
            int num = Integer.parseInt(br.readLine());
            if(num==0) {
                if(pq.size()!=0) {
                    sb.append(pq.poll()).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else {
                pq.add(num);
            }
        }

        System.out.println(sb);
    }
}
