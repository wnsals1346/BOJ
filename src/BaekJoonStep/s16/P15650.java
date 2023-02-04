package BaekJoonStep.s16;
//https://www.acmicpc.net/problem/15650 - N과 M (2)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P15650 {
    static int[] arr;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        nAndMTwo(1, n, 0);
        System.out.println(sb);

    }

    public static void nAndMTwo(int start, int n, int lv) {
        if (lv == arr.length) { //lv is from 0
            for (int i = 0; i < arr.length - 1; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append(arr[arr.length - 1]).append("\n");

        } else {
            for (int i = start; i <= n; i++) {
                arr[lv] = i;
                nAndMTwo(i + 1, n, lv + 1); //삽입한 수 보다 큰 수를 인자로 넘김
            }

        }
    }
}
