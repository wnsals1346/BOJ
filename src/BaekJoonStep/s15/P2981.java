package BaekJoonStep.s15;
//https://www.acmicpc.net/problem/2981 - 검문

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2981 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        int[] arr = new int[c];
        for (int i = 0; i < c; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        First : for (int m = 2; m <= arr[1]-arr[0] ; m++) { //첫 수와 두번째 수의 차보다 높아지면 나머지가 같을 수 없음. ex) 3, 7 일때 5부터는 절대 같아질 수 없다.
            int mod = arr[0]%m;
            for (int i = 1; i < arr.length; i++) {
                if((arr[i]-mod)%m!=0) continue First;
            }
            sb.append(m).append("\n");
        }
        System.out.println(sb);
    }
}
