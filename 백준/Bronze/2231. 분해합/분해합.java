import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        final int N = 1000000;
        int sum=0, num;
        int i = 1;
        for (; i<N; i++) {
            num = i;
            sum = num;
            while(num!=0) {
                sum += num%10;
                num /= 10;
            }
            if(sum==input || i==input) {
                break;
            }
        }
        if(sum==input) {
            System.out.println(i);
        } else {
            System.out.println(0);
        }
    }
}
