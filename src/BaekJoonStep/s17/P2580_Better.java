package BaekJoonStep.s17;
//https://www.acmicpc.net/problem/2580 - 스도쿠

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P2580_Better {
    static int[][] map;
    static ArrayList<int[]> list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        map = new int[9][9];
        list = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                if((map[i][j] = Integer.parseInt(st.nextToken()))==0) {
                    list.add(new int[] {i,j});
                }
            }
        }

        dfs(0); //넣을 수 있는 값을 고른 뒤에 넣어주는 방법

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                bw.write(String.valueOf(map[i][j]));
                bw.write(' ');
            }
            bw.newLine();
        }
        bw.close();
    }
    public static boolean dfs(int i) {
        boolean[] used = new boolean[9];  //안에다가 배열을 만드는 것은 메모리 효율상 좋지않음.
        if(i==list.size()) {
            return true;
        }
        else {
            int[] current = list.get(i);
            feasible(used, current[0],current[1]);
            for (int j = 0; j < 9; j++) {
                if(used[j]) continue;
                map[current[0]][current[1]] = j+1;
                if(dfs(i+1)) return true;
                map[current[0]][current[1]] = 0;
            }
            return false;
        }
    }
    public static void feasible(boolean[] used, int i, int j) {
        for (int k = 0; k < 9; k++) { //used num in row
            if(map[i][k]==0 || used[map[i][k]-1]) continue;
            used[map[i][k]-1] = true;
        }
        for (int k = 0; k < 9; k++) { //used num in col
            if(map[k][j]==0 || used[map[k][j]-1]) continue;
            used[map[k][j]-1] = true;
        }
        for (int k = (i/3)*3; k < (i/3)*3+3; k++) { //used num in square
            for (int l = (j/3)*3; l < (j/3)*3+3; l++) {
                if(map[k][l]==0 || used[map[k][l]-1]) continue;
                used[map[k][l]-1] = true;
            }
        }
    }
}

