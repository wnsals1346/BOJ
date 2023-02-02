package BaekJoonStep.s09;
//https://www.acmicpc.net/problem/2566 = 최댓값

import java.util.Scanner;

public class P2566 {
    public static void main(String[] args) {
        int[][] arr = new int[9][9];
        Scanner in = new Scanner(System.in);
        int max = -1;
        String loc = "";
        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {
                arr[i][j] = in.nextInt();
                if(arr[i][j]>max){
                    max = arr[i][j];
                    loc = (i+1)+" "+(j+1);
                }
            }
        }
        System.out.println(max);
        System.out.println(loc);
    }
}
