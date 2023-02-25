package BaekJoonETC._3Gold;
//https://www.acmicpc.net/problem/1715 - 카드 정렬하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P1715 {
    static List<Integer> list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        if(n==1) {
            System.out.println(0);
            return;
        }

        int res = 0;
        Collections.sort(list);
        while(list.size()>=2) {
            int cur = list.remove(0)+list.remove(0);
            res += cur;
            insertion(cur);
        }

        System.out.println(res);
    }
    public static void insertion(int cur) {
        int idx = 0;
        while(idx<list.size() && cur>=list.get(idx)) idx++;
        if(idx==list.size()) list.add(cur);
        else list.add(idx, cur);

    }
}
