import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        int[] arr = new int[c];
        for (int i = 0; i < c; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        int gcd;
        if(arr.length==2) {
            gcd = arr[1]-arr[0];
        } else {
            gcd = gcd(arr[1]-arr[0],arr[2]-arr[1]);
            int temp;
            for (int i = 3; i < arr.length-1; i++) {
                if(i%2==0) continue;
                temp = gcd(arr[i]-arr[i-1],arr[i+1]-arr[i]);
                gcd = gcd(temp, gcd);
            }
        }
        
        for (int i = 2; i <= gcd; i++) {
            if(gcd%i==0) sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
    static int gcd(int a, int b) {
        int r;
        while(b!=0) {
            r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
}


