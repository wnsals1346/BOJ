package BaekJoonStep.s08;
//https://www.acmicpc.net/problem/1929 - 소수 구하기
import java.util.Scanner;

public class P1929 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        boolean[] p = new boolean[b+1];
        primeFinder(p);
        for(int i=a;i<p.length;i++) {
            if(!p[i]) System.out.println(i);
        }
    }
    static void primeFinder(boolean[] prime) {
        prime[0] = prime[1] = true;
        for(int i=2;i<=Math.sqrt(prime.length);i++) {
            if(prime[i]) continue;
            for(int j=i+i;j<prime.length;j+=i) {
                prime[j] = true;
            }
        }
    }
}
