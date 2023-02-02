package BaekJoonStep.s13;
//https://www.acmicpc.net/problem/10815 - 숫자 카드

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class P10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> cardPool = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(n-->0) {
            cardPool.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        st= new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(m-->0) {
            if(cardPool.contains(Integer.parseInt(st.nextToken()))) sb.append(1).append(" ");
            else sb.append(0).append(" ");
        }
        System.out.println(sb);
    }
}
