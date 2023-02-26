package BaekJoonETC._2Silver;
//https://www.acmicpc.net/problem/16953 - A → B

import java.util.Scanner;

public class P16953 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int cnt = 0;
        while(A<B) {
            if(B%10==1) {
                B /= 10;
                cnt++;
            } else if(B%2==0) {
                B /= 2;
                cnt++;
            } else {
                break;
            }
        }
        if(A==B) {
            System.out.println(cnt+1);
        } else {
            System.out.println(-1);
        }
    }
}
