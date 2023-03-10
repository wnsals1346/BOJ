package BaekJoonStep.s11;
//https://www.acmicpc.net/problem/2587 - 대표값2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        bubbleSort(arr);
        System.out.println(sum/5);
        System.out.println(arr[arr.length/2]);
    }
    static void bubbleSort(int[] arr) {
        int temp;
        for(int i=0;i<arr.length;i++) {
            for(int j=1;j<arr.length-i;j++) {
                if(arr[j-1]>arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
