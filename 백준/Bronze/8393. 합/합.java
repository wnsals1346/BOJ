import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 0;
        for(;n>0;n--){
            t += n;
        }
        System.out.println(t);
    }
}
