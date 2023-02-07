package BaekJoonStep.s16;
//https://www.acmicpc.net/problem/2580 - 스도쿠

import java.io.*;
import java.util.StringTokenizer;

public class P2580 {
    static int[][] map, empty;
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        map = new int[9][9];
        empty = new int[81][2];

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                if((map[i][j] = Integer.parseInt(st.nextToken()))==0) {
                    empty[cnt][0] = i;
                    empty[cnt][1] = j;
                    cnt++;
                }
            }
        }

        dfs(0,0,0,0);  //일단 하나씩 넣고 넣은 값을 검증하는 방법 : 넣을 값이 많아서 더 느리다.

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                bw.write(String.valueOf(map[i][j]));
                bw.write(' ');
            }
            bw.newLine();
        }
        bw.close();
    }
    public static boolean dfs(int n, int i, int x, int y) {
        if (!feasible2(x, y)) {
            return false;
        }
        else if(n==cnt) {
            return true;
        }
        else {
            for (int j = 0; j < 9; j++) {
                map[empty[i][0]][empty[i][1]] = j+1;
                if(dfs(n+1,i+1, empty[i][0], empty[i][1])) return true;
                map[empty[i][0]][empty[i][1]] = 0;
            }

            return false;
        }
    }

    public static boolean feasible2(int i, int j) {
        if(map[i][j]==0) return true;
        for (int k = 0; k < 9; k++) { //used num in row
            if(k==j) continue;
            if(map[i][j]==map[i][k]) return false;
        }
        for (int k = 0; k < 9; k++) { //used num in col
            if(k==i) continue;
            if(map[i][j]==map[k][j]) return false;
        }
        for (int k = (i/3)*3; k < (i/3)*3+3; k++) { //used num in square
            for (int l = (j/3)*3; l < (j/3)*3+3; l++) {
                if(k==i&&l==j) continue;
                if(map[i][j]==map[k][l]) return false;
            }
        }
        return true;
    }
}
