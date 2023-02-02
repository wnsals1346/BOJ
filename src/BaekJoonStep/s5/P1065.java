package BaekJoonStep.s5;
//https://www.acmicpc.net/problem/1065 - 한수

import java.util.Scanner;

public class P1065 {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        System.out.println(hansu(in.nextInt()));

    }
    static int hansu(int n) {
        int cnt = 0;
        if(n<100) {
            cnt = n;
        } else if(n<1000) {
            cnt += 99;
            for(int i=100;i<=n;i++) {
                if((i/100-(i/10)%10)==(i/10)%10-i%10) cnt++;
            }
        } else { //n이 1000일때 1000은 한수가 아니라서 999와 같음.
            cnt = hansu(999);
        }
        return cnt;
    }
}
