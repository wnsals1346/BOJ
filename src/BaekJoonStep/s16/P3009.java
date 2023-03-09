package BaekJoonStep.s16;
//https://www.acmicpc.net/problem/3009 - 네 번째 점

import java.util.HashMap;
import java.util.Scanner;

public class P3009 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 3, m;
        HashMap<Integer,Integer> hmx = new HashMap<>();
        HashMap<Integer,Integer> hmy = new HashMap<>();
        while(n-->0) {
            m = in.nextInt();
            hmx.put(m,hmx.getOrDefault(m,0)+1);
            m = in.nextInt();
            hmy.put(m,hmy.getOrDefault(m,0)+1);
        }
        StringBuilder sb = new StringBuilder();
        for (Integer key :hmx.keySet()) {
            if(hmx.get(key)==1) sb.append(key).append(" ");
        }
        for (Integer key :hmy.keySet()) {
            if(hmy.get(key)==1) sb.append(key).append(" ");
        }
        System.out.println(sb);
    }
}
