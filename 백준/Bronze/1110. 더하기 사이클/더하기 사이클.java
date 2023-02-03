import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputnum = sc.nextInt();
        int calnum = inputnum;
        int count = 0;
        do {
            calnum = calnum%10*10+(calnum/10+calnum%10)%10;
            count++;
        } while(inputnum!=calnum);
        System.out.print(count);
    }
}