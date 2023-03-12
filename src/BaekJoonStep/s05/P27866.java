package BaekJoonStep.s05;
//https://www.acmicpc.net/problem/27866 - 문자와 문자열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int i = Integer.parseInt(br.readLine());
        System.out.println(str.charAt(i-1));
    }
}
