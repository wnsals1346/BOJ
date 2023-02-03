import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int cnt = 0;
        while(num>=5) {
            cnt += num/5;
            num/=5;
        }
        System.out.println(cnt);
    }
}
