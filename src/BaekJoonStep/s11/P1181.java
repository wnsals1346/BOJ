package BaekJoonStep.s11;
//https://www.acmicpc.net/problem/1181 - 단어 정렬

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class P1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> hashSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        while(n-->0) {
            hashSet.add(br.readLine());
        }
        String[] str = hashSet.toArray(new String[0]);
        mergeSort(str, 0, str.length-1);
        for (int i = 0; i < str.length; i++) {
            sb.append(str[i]).append("\n");
        }
        System.out.println(sb);
    }
    public static void mergeSort(String[] arr, int left, int right) {
        if(left<right) {
            int mid = (left+right)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }
    private static void merge(String[] arr, int left, int mid, int right) {
        String[] temp = new String[right-left+1];
        int i = left, j = mid+1, k = 0;
        while(i<=mid && j<=right) {
            if(arr[i].length()<arr[j].length()) {
                temp[k++] = arr[i++];
            } else if (arr[i].length()==arr[j].length()) {
                if(arr[i].compareTo(arr[j])<=0) {
                    temp[k++] = arr[i++];
                } else {
                    temp[k++] = arr[j++];
                }
            } else {
                temp[k++] = arr[j++];
            }
        }
        while(i<=mid) {
            temp[k++] = arr[i++];
        }
        while(j<=right) {
            temp[k++] = arr[j++];
        }
        i = left;
        k = 0;
        while(i<=right) {
            arr[i++] = temp[k++];
        }
    }
}
