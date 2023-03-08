package BaekJoonStep.s19;
//https://www.acmicpc.net/problem/13305 - 주유소

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ans = new int[19];
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] price = new int[N], dist = new int[N-1];
        for (int i = 0; i < dist.length; i++) {
            dist[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < price.length; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }
        
        int p = price[0], res = p*dist[0];

        for (int i = 1; i < dist.length; i++) {
            if(p<=price[i]) {
                res += p*dist[i];
            } else {
                p = price[i];
                res += p*dist[i];
            }
        }
        System.out.println(res);
        
    }
}
