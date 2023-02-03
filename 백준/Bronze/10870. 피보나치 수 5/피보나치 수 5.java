import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(fibonacci(in.nextInt()));
    }
    static int fibonacci(int n) {
        if(n==0) return 0;
        else if (n==1) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
