package BaekJoonStep.s16;
//https://www.acmicpc.net/problem/11050 - 이항 계수 1

import java.util.Scanner;

public class P11050 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int ans = 1;
        for (int i = 0; i < b; i++) {
            ans *= a-i;
            ans /= i+1;
        }
        System.out.println(ans);
    }
}
