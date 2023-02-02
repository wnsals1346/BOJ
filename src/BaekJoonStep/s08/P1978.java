package BaekJoonStep.s08;
//https://www.acmicpc.net/problem/1978 - 소수 찾기

import java.io.*;
import java.util.StringTokenizer;

public class P1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ans = 0;
        for(;N>0;N--) {
            ans += sol(Integer.parseInt(st.nextToken()));
        }
        System.out.println(ans);
    }
    static int sol(int num) {
        int end = num/2;
        if(num==1) return 0;
        for(int i=2;i<=end;i++) {
            if(num%i==0) {
                return 0;
            }
        }
        return 1;
    }
}


/*
    static void primeFinder(boolean[] prime) {
        prime[0] = prime[1] = true;
        for(int i=2;i<=Math.sqrt(prime.length);i++) {
            if(prime[i]) continue;
            for(int j=i+i;j<prime.length;j+=i) {
                prime[j] = true;
            }
        }
    }*/
