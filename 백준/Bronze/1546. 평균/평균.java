import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Float> arr = new ArrayList<>();

        for(int i=0;i<n;i++) {
            arr.add(sc.nextFloat());
        }
        Collections.sort(arr);
        float max = arr.get(n-1);

        for(int i=0;i<n;i++) {
            arr.set(i,arr.get(i)/max*100);
        }

        float sum = 0;
        for(float num : arr) {
            sum += num;
        }
        System.out.println(sum/n);
    }
}