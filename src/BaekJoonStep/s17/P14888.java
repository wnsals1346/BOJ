package BaekJoonStep.s17;
//https://www.acmicpc.net/problem/14888 - 연산자 끼워넣기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14888 {
    static int[] op = new int[4];
    static int[] seq;
    static int[] arr;
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
                for (int i = 0; i < 4; i++) {
            op[i] = Integer.parseInt(st.nextToken());
        }
        seq = new int[N-1];
        find(N-1,0);
        System.out.println(max);
        System.out.println(min);
    }
    public static void find(int total, int k) {
        if(k==total) {
            int ans = arr[0];
            for (int i = 0; i < total; i++) {
                ans = operator(ans, seq[i], arr[i+1]);
            }
            min = Math.min(ans,min);
            max = Math.max(ans,max);
        } else {
            for (int i = 0; i < 4; i++) {
                if(op[i]==0) continue;
                op[i]--;
                seq[k] = i;
                find(total, k+1);
                op[i]++;
            }
        }
    }
    public static int operator( int a, int i, int b) {
        switch(i) {
            case 0 : return a+b;
            case 1 : return a-b;
            case 2 : return a*b;
            case 3 : return a/b;
            default : return 0;
        }
    }
}

