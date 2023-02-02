package BaekJoonETC._1Bronze;
//https://www.acmicpc.net/problem/2577 - 숫자의 개수

import java.util.Scanner;

public class P2577 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = in.nextInt()*in.nextInt()*in.nextInt();
        int[] cnt = new int[10];
        StringBuilder sb = new StringBuilder();
        while(sum>0) {
            cnt[sum%10]++;
            sum /=10;
        }
        for(int i=0;i<cnt.length;i++) {
            sb.append(cnt[i]).append('\n');
        }
        System.out.println(sb);
    }
}
