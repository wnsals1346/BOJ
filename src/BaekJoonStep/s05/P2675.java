package BaekJoonStep.s05;
////https://www.acmicpc.net/problem/2675 - 문자열 반복

import java.util.Scanner;

public class P2675 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr;
        int n = in.nextInt();
        for(;n>0;n--) {
            int repeat = in.nextInt();
            arr = in.next().split("");
            for(int i=0;i<arr.length;i++) {
                System.out.print(arr[i].repeat(repeat));
            }
            System.out.println("");

        }

    }
}
