package BaekJoonStep.s03;
//https://www.acmicpc.net/problem/1110 - 더하기 사이클

import java.util.Scanner;

public class P1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rn = 0;
        int n = sc.nextInt();
        int f = n;
        while(true) {
            int a = n/10 + n%10;
            int r = n%10*10 + a%10;
            rn++;
            if(f==r) {
                System.out.println(rn);
                break;
            }

            n=r;
        }
    }
}