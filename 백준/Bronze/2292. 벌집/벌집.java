import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int room = in.nextInt();
        if(room==1) {
            System.out.println(1);
            return;
        }
        while(3*(n*(n-1))+1-room<0) {
            n++;
        }
        System.out.println(n);
    }
}
