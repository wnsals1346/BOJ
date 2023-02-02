package BaekJoonStep.s8;
//https://www.acmicpc.net/problem/4948 - 베르트랑 공준

import java.util.Scanner;

public class P4948 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean[] p = new boolean[123456*2+1];
        primeFinder(p);
        int n = in.nextInt();
        while(n!=0) {
            int cnt = 0;
            for(int i=n+1;i<2*n+1;i++) {
                if(!p[i]) cnt++;
            }
            System.out.println(cnt);
            n = in.nextInt();
        }



    }
    static void primeFinder(boolean[] prime) {
        prime[0] = prime[1] = true;
        for(int i=2;i<=Math.sqrt(prime.length);i++) {
            if(prime[i]) continue;
            for(int j=i+i;j<prime.length;j+=i) {
                prime[j] = true;
            }
        }
    }
}

