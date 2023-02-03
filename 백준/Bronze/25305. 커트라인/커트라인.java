import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[Integer.parseInt(st.nextToken())];
        int cutoff = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<arr.length;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(subSelectionSort(arr, cutoff));
    }
    static int subSelectionSort(int[] arr, int cutoff) {
        int indexMax, temp;
        for(int i=arr.length-1;i>=arr.length-cutoff;i--) {
            indexMax = i;
            for(int j=0;j<i+1;j++) {
                if(arr[j]>arr[indexMax]) {
                    indexMax = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[indexMax];
            arr[indexMax] = temp;
        }
        return arr[arr.length-cutoff];
    }
}
