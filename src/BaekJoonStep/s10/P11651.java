package BaekJoonStep.s10;
//https://www.acmicpc.net/problem/11651 - 좌표 정렬하기 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        quickSort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        System.out.println(sb);
    }
    static void quickSort(int[][] arr, int left, int right) {  // x : [i][0], y : [i][1]
        if(left>=right) return;

        int pivot = partition(arr, left, right);
        quickSort(arr, left, pivot-1);
        quickSort(arr, pivot+1, right);
    }
    static int partition(int[][] arr, int left, int right) {
        int p = (int) (Math.random()*(right+1-left)+left);
        int i = left-1;
        int j = left;
        for(;j<=right;j++) {
            if(arr[j][1]<arr[p][1]) {
                i++;
                if(i==p) {
                    i++;
                }
                if(i!=j) {
                    twoDiSwap(arr, i, j);
                }

            } else if (arr[j][1]==arr[p][1]) {
                if(arr[j][0]<arr[p][0]) {
                    i++;
                    if(i==p) i++;
                    if(i!=j) {
                        twoDiSwap(arr, i, j);
                    }
                }
            }
        }
        if(i<p) {
            twoDiSwap(arr, i+1, p);
            return i+1;
        }
        else {
            twoDiSwap(arr, i, p);
            return i;
        }
    }
    static void twoDiSwap(int[][] arr, int i, int j) {
        int temp;

        for(int k=0;k<arr[0].length;k++) {
            temp = arr[i][k];
            arr[i][k] = arr[j][k];
            arr[j][k] = temp;
        }
    }

}
