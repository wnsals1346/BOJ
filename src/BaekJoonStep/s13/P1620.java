package BaekJoonStep.s13;
//https://www.acmicpc.net/problem/1620 - 나는야 포켓몬 마스터 이다솜

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] arr = new String[n+1];
        HashMap<String, Integer> map = new HashMap<>();
        String str;
        for (int i = 1; i < n+1; i++) {
            str = br.readLine();
            arr[i] = str;
            map.put(str,i);
        }
        StringBuilder sb = new StringBuilder();
        while(m-->0) {
            str = br.readLine();
            if(str.charAt(0)<65) sb.append(arr[Integer.parseInt(str)]).append("\n");
            else sb.append(map.get(str)).append("\n");
        }
        System.out.println(sb);
    }

}
