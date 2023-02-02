package BaekJoonStep.s11;
//https://www.acmicpc.net/problem/25501 - 재귀의 귀재

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P25501{
    static int cnt = 0;
    public static int recursion(String s, int l, int r){
        cnt++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str;
        while(n-->0) {
            str = br.readLine();
            System.out.println(isPalindrome(str)+" "+cnt);
            cnt=0;
        }
    }
}