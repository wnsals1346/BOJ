package BaekJoonStep.s08;
//https://www.acmicpc.net/problem/11653 - 소인수분해

import java.util.Scanner;

public class P11653 {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int sqrt = (int) Math.sqrt(10000000);
        if(N==1) return;
        for(int i=2;i<sqrt;i++) {
            if(N==1) break;
            while(N!=1&&N%i==0) {
                System.out.println(i);
                N /= i;
            }
        }
        if(N!=1) {
            System.out.println(N);
        }
    }
}
