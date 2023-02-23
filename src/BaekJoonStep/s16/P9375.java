package BaekJoonStep.s16;
//https://www.acmicpc.net/problem/9375 - 패션왕 신해빈

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class P9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hm;
        StringBuilder sb = new StringBuilder();
        String str;
        while (c-- > 0) {
            hm = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            while (n-- > 0) {
                str = br.readLine().split(" ")[1];
                hm.put(str, hm.getOrDefault(str, 0) + 1);
            }
            sb.append(sol(hm)).append("\n");
        }
        System.out.println(sb);
    }

    static <K, V> int sol(HashMap<K, V> hm) {
        int ans = 1;
        for (V value : hm.values()) {
            ans *= (int) value + 1;
        }
        ans--;
        return ans;
    }
}
