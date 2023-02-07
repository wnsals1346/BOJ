package BaekJoonStep.s16;
//https://www.acmicpc.net/problem/9663 - N-Queen

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P9663 {

    static int N, cnt;
    static int[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        visit = new int[N];
        bt(0);
        System.out.println(cnt);


    }

    public static void bt(int idx) {
        if(idx==N) {
            cnt++;
            System.out.println(Arrays.toString(visit));
        }
        else {
            for (int i = 0; i < N; i++) {
                if(!isPromising(idx, i)) continue;
                visit[idx] = i;
                bt(idx+1);
                visit[idx] = 0;
            }
        }
    }

    public static boolean isPromising(int idx, int val) {
        for (int i = 0; i < idx; i++) {
            if(visit[i]==val) return false; // check column
            if(Math.abs(i-idx)==Math.abs(visit[i]-val)) return false; //check diagonal
        }
        return true;
    }
}
