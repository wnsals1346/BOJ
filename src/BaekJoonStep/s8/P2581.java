package BaekJoonStep.s8;
//https://www.acmicpc.net/problem/2581 - 소수

import java.util.Scanner;

public class P2581 {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int min = -1;
        for(int i=in.nextInt(), j=in.nextInt();i<=j;i++){
            sum += sol(i);
            if(min==-1&&sol(i)!=0) {
                min = sol(i);
            }
        }
        if(sum==0) System.out.println(-1);
        else System.out.print(sum+"\n"+min);
    }
    static int sol(int num) {
        int end = (int)Math.sqrt(num);
        if(num==1) return 0;
        else if(num==2||num==3) return num;
        for(int i=2;i<=end;i++) {
            if(num%i==0) {
                return 0;
            }
        }
        return num;
    }
}
