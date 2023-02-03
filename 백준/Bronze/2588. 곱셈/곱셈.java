import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B;
        A = sc.nextInt();
        B = sc.nextInt();
        System.out.println(A*(B%10));
        System.out.println(A*(B/10%10));
        System.out.println(A*(B/100));
        System.out.println(A*(B%10)+A*(B/10%10)*10+A*(B/100)*100);
    }
}
