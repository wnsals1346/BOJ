package BaekJoonStep.s08;
//https://www.acmicpc.net/problem/2292 - 벌집

import java.util.Scanner;

public class P2292 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int room = in.nextInt();
        if(room==1) {
            System.out.println(1);
            return;
        }
        while(3*(n*(n-1))+1<room) {
            n++;
        }
        System.out.println(n);
    }
}

    /*private static int solution(int n) {
        // 1: 1 (1)
        // 2 ~ 7 : 2 (6개)
        // 8 ~ 19 : 3 (12개)
        // 20 ~ 37 : 4 (18개)
        // 38 ~ 61 : 5 (24개)
        // ...생략..
        // a(n) = a(n-1) + 6(n-1) | a(n): 첫 항
        if(n == 1) return 1;
        int i=2;
        int k=1;

        while(i<=n) {
            i += 6*k++;
        }

        return k;
    }*/