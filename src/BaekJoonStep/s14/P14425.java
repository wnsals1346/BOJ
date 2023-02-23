package BaekJoonStep.s14;
//https://www.acmicpc.net/problem/14425 - 문자열 집합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class P14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> hashSet = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        while(n-->0) {
            hashSet.add(br.readLine());
        }
        int cnt = 0;
        while(m-->0) {
            if(hashSet.contains(br.readLine())) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
