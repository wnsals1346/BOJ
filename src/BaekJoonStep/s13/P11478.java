package BaekJoonStep.s13;
//https://www.acmicpc.net/problem/11478 - 서로 다른 부분 문자열의 개수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class P11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        HashSet<String> hs = new HashSet<>();
        for (int length = 1; length <= s.length(); length++) {
            for (int j = 0; j <= s.length() - length; j++) {
                hs.add(s.substring(j,j+length));
            }
        }
        System.out.println(hs.size());

    }
}
