import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];
        int a, b, c;
        int ans;
        while(true) {
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            if(a==0) break;
            arr[0] = a*a;
            arr[1] = b*b;
            arr[2] = c*c;
            Arrays.sort(arr);
            if(arr[0]+arr[1]==arr[2]) System.out.println("right");
            else System.out.println("wrong");
        }
    }
}
