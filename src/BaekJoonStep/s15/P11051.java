package BaekJoonStep.s15;
//https://www.acmicpc.net/problem/11051 - 이항 계수 2

import java.util.Scanner;

public class P11051 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int ans = 1;
        int[][] cache = new int[n+1][k+1];

        for (int i = 0; i < n+1; i++) {
            cache[i][0] = 1;
        }
        for (int i = 0; i < k+1; i++) {
            cache[i][i] = 1;
        }
        for (int i = 2; i < n + 1; i++) {
            for (int j = 1; j < k + 1 && j<i+1; j++) {
                cache[i][j] = (cache[i-1][j] + cache[i-1][j-1])%10007;
            }
        }
        ans = cache[n][k];
        System.out.println(ans);
    }
}
