package BaekJoonStep.s15;
//https://www.acmicpc.net/problem/1676 - 팩토리얼 0의 개수

import java.util.Scanner;

public class P1676 {
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
