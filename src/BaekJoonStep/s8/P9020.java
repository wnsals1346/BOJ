package BaekJoonStep.s8;
//https://www.acmicpc.net/problem/9020 - 골드바흐의 추측

import java.util.Scanner;

public class P9020 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean[] p = new boolean[10001];
        primeFinder(p);
        int n = in.nextInt();
        for(;n>0;n--) {
            int num = in.nextInt();
            for(int i=num/2;i<num-1;i++) {
                if(!p[i]&&!p[num-i]) {
                    System.out.println((num-i)+" "+i);
                    break;
                }
            }
        }



    }
    static void primeFinder(boolean[] prime) { // 에라토스테네스의체 소수는 false 아니면 true
        prime[0] = prime[1] = true;
        for(int i=2;i<=Math.sqrt(prime.length);i++) {
            if(prime[i]) continue;
            for(int j=i+i;j<prime.length;j+=i) {
                prime[j] = true;
            }
        }
    }
}

