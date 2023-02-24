package BaekJoonStep.s05;
//https://www.acmicpc.net/problem/11718 - 그대로 출력하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        StringBuilder sb = new StringBuilder();
        while((str = br.readLine()) != null && str.length()!=0) {
            sb.append(str).append("\n");
        }
        System.out.println(sb);
    }
}
