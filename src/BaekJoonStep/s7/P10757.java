package BaekJoonStep.s7;
//https://www.acmicpc.net/problem/10757 - 큰 수 A+B

import java.util.Scanner;
public class P10757 {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        int[] numA = new int[10001];
        int[] numB = new int[10001];
        for(int i=0;i<a.length();i++) {
            numA[i] = Character.getNumericValue(a.charAt(a.length()-i-1));
        }
        for(int i=0;i<b.length();i++) {
            numB[i] = Character.getNumericValue(b.charAt(b.length()-i-1));
        }
        int maxLength = Math.max(a.length(),b.length());
        for(int i=0;i<maxLength;i++) {
            int temp = numA[i]+numB[i];
            numA[i] = temp%10;
            if(temp>9) {
                numA[i+1] += 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        if(numA[maxLength]!=0) sb.append(numA[maxLength]);
        for(int i=0;i<maxLength;i++) {
            sb.append(numA[maxLength-i-1]);
        }
        System.out.println(sb);
    }
}



// Collections.reverse();