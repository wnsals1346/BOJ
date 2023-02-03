import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        int n = 0;
        int k;
        int a;
        int b;
        boolean flag = true;
        k = in.nextInt();
        while(i<k) {
            i += ++n;
            flag = !flag;
        }
        if(flag) {
            a = n-i+k;
            b = i-k+1;
        } else {
            a = i-k+1;
            b = n-i+k;
        }
        System.out.printf("%d/%d",a,b);
    }
}

