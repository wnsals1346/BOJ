package BaekJoonStep.s16;
//https://www.acmicpc.net/problem/9663 - N-Queen

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9663_better {

    static int N, cnt;
    static int[][] board;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        bt(0);
        System.out.println(cnt);

    }

    public static void bt(int idx) {
        if(idx==N) {
            cnt++;
        }
        else {
            for (int i = 0; i < N; i++) {
                if(board[idx][i]!=0) continue;
                promising(idx, i, 1);
                bt(idx+1);
                promising(idx, i, -1);
            }
        }
    }

    public static void promising(int row, int col, int num) {
        for (int i = row+1; i < N; i++) {
            board[i][col] += num;
            if(col-(i-row)>=0) board[i][col-(i-row)] += num;
            if(col+(i-row)<N) board[i][col+(i-row)] += num;
        }
    }
}
