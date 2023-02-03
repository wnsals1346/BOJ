import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(factorial(in.nextInt()));
    }
    static int factorial(int n) {
        if(n==0 || n==1) return 1;
        return n*factorial(n-1);
    }
}
