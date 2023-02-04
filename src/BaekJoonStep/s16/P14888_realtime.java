package BaekJoonStep.s16;
//https://www.acmicpc.net/problem/14888 - 연산자 끼워넣기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14888_realtime {
    static int[] op = new int[4];
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
        find(N - 1, 0, arr[0]);
        System.out.println(max);
        System.out.println(min);
    }

    public static void find(int total, int k, int result) {
        if (k == total) {
            min = Math.min(result, min);
            max = Math.max(result, max);
        } else {
            for (int i = 0; i < 4; i++) {
                if (op[i] == 0) continue;
                op[i]--;
                operator(total, i, k, result);
                op[i]++;
            }
        }
    }

    public static void operator(int total, int i, int k, int result) {
        switch (i) {
            case 0:
                find(total, k + 1, result + arr[k + 1]);
                break;
            case 1:
                find(total, k + 1, result - arr[k + 1]);
                break;
            case 2:
                find(total, k + 1, result * arr[k + 1]);
                break;
            case 3:
                find(total, k + 1, result / arr[k + 1]);
                break;
            default:
        }
    }
}

