package BaekJoonStep.s06;
//https://www.acmicpc.net/problem/2444 - 별 찍기 - 7

import java.io.IOException;
import java.util.Scanner;

public class P2444 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(" ".repeat(n-i)).append("*".repeat(2*i-1)).append("\n");
        }
        for (int i = n-1; i > 0; i--) {
            sb.append(" ".repeat(n-i)).append("*".repeat(2*i-1)).append("\n");
        }
        System.out.println(sb);
    }
}
