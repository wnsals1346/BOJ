package BaekJoonStep.s10;
//https://www.acmicpc.net/problem/2750 - 수 정렬하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        insertionSort(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }

    }
    static void insertionSort(int[] arr) {
        int prev, temp;
        for(int i=1;i<arr.length;i++) {
            prev = i-1;
            temp = arr[i];
            while(prev>=0 && arr[prev]>temp) {  // temp자리에 arr[i]를 넣으면 안됨!!!
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = temp;
        }
    }
}
