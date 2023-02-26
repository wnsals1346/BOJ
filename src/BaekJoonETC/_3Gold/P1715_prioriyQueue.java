package BaekJoonETC._3Gold;
//https://www.acmicpc.net/problem/1715 - 카드 정렬하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class P1715_prioriyQueue {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> list = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        int res = 0;
        while(list.size()>=2) {
            int cur = list.poll()+list.poll();
            res += cur;
            list.add(cur);
        }
        System.out.println(res);
    }

}
