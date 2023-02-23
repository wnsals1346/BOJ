package BaekJoonStep.s12;
//https://www.acmicpc.net/problem/2447 - 별 찍기 - 10

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2447 {
    static char[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        StringBuilder sb = new StringBuilder();

        drawStar(0,0,N,false);

        for (int i = 0; i < N; i++) {
            sb.append(map[i]).append("\n");
        }
        System.out.println(sb);
    }
    static void drawStar(int row, int column, int n, boolean empty) {
        int cnt = 0;
        if(n==1&&!empty) {
            map[row][column] = '*';
        } else if (empty) {
            for (int i = row; i < row+n; i ++) {
                for (int j = column; j < column+n; j ++) {
                    map[i][j] = ' ';
                }
            }
        } else {
            for (int i = row; i < row+n; i += n/3) {
                for (int j = column; j < column+n; j += n/3) {
                    cnt++;
                    drawStar(i,j,n/3, check(cnt));

                }
            }
        }
    }
    public static boolean check(int cnt) {
        if (cnt == 5) return true;
        return false;
    }
}
