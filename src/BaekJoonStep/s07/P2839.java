package BaekJoonStep.s07;
//https://www.acmicpc.net/problem/2839 - 설탕배달

import java.util.Scanner;

public class P2839 {
    public static void main(String[] agrs) {
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int big = 0;
         int small = 0;
         int total = -1;

         if(n%5==0) { //5의 배수인 경우
             big = n/5;
         } else {
             int k = n/5;
             while(k>0) { //5의배수와 3의배수로 이루어진경우 5가 가질 수 있는 최대부터 하나씩 빼며 계산
                 if((n-5*k)%3==0) {
                     big = k;
                     small = (n-5*k)/3;
                     break;
                 }
                 k--;
             }
             if(k==0&&n%3==0) { //위 경우에 만족하지 않은 3의 배수
                 small = n/3;
             }
         }
         if(big!=0||small!=0) {
             total = big+small;
         }
        System.out.println(total);
    }
}
