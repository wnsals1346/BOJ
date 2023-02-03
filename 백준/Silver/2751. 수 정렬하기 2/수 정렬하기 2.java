import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++) {
            bw.write(arr[i]+"\n");
        }
        bw.close();
        br.close();
    }
    static void mergeSort(int[] arr, int left, int right) {
        if(left<right) {
            int mid = (left+right)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }
    static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right-left+1];
        int i = left, j = mid+1, k = 0;
        while(i<=mid && j<=right) {
            if(arr[i]<=arr[j]) {
                temp[k++] = arr[i++];
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
