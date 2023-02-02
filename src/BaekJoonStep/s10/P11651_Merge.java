package BaekJoonStep.s10;
//https://www.acmicpc.net/problem/11651 - 좌표 정렬하기 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11651_Merge {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        System.out.println(sb);
    }

    static void mergeSort(int[][] arr, int left, int right) {
        if(left>=right) return;
        int mid = (left+right)/2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);
        merge(arr, left, mid, right);
    }
    static void merge(int[][] arr, int left, int mid, int right) {
        int[][] temp = new int[right-left+1][2];
        int i = left, j = mid+1, k = 0;
        while(i<=mid && j<=right) {
            if(arr[i][1]<arr[j][1]) {
                temp[k][0] = arr[i][0];
                temp[k][1] = arr[i][1];
                i++;
            } else if(arr[i][1]==arr[j][1]) {
                if(arr[i][0]<=arr[j][0]) {
                    temp[k][0] = arr[i][0];
                    temp[k][1] = arr[i][1];
                    i++;
                } else {
                    temp[k][0] = arr[j][0];
                    temp[k][1] = arr[j][1];
                    j++;
                }
            } else {
                temp[k][0] = arr[j][0];
                temp[k][1] = arr[j][1];
                j++;
            }
            k++;
        }
        while(i<=mid) {
            temp[k][0] = arr[i][0];
            temp[k][1] = arr[i][1];
            k++;i++;
        }
        while(j<=right) {
            temp[k][0] = arr[j][0];
            temp[k][1] = arr[j][1];
            k++;j++;
        }
        i = left;
        k = 0;
        while(i<=right) {
            arr[i][0] = temp[k][0];
            arr[i][1] = temp[k][1];
            k++;i++;
        }
    }
}
