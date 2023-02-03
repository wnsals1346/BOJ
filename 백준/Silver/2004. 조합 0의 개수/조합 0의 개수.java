import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int cntTwo = countTwo(n) - (countTwo(m) + countTwo(n-m));
        int cntFive = countFive(n) - (countFive(m) + countFive(n-m));
        int ans = Math.min(cntTwo,cntFive);
        System.out.println(ans);
    }
    static int countFive(int n) {
        int cnt = 0;
        while(n>=5) {
            cnt += n/5;
            n /= 5;
        }
        return cnt;
    }
    static int countTwo(int n) {
        int cnt = 0;
        while(n>=2) {
            cnt += n/2;
            n /= 2;
        }
        return cnt;
    }
}
