import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int cnt = 1;
    static int output = 0;
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }
        mergeSort(arr,0,arr.length-1,num);
        if(cnt!=-1) {
            System.out.println(-1);
        } else {
            System.out.println(output);
        }
    }
    public static void mergeSort(int[] arr, int left, int right, int n) {
        if(left<right) {
            int mid = (left+right)/2;
            mergeSort(arr, left, mid, n);
            mergeSort(arr, mid+1, right, n);
            merge(arr, left, mid, right, n);
        }
    }
    private static void merge(int[] arr, int left, int mid, int right, int n) {
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
            arr[i++] = temp[k];
            if(cnt==-1) return;
            else if (cnt!=n) {
                cnt++;
            }
            else {
                output = temp[k];
                cnt=-1;
            }
            k++;
        }
    }

}
