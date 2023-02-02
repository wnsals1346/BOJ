package BaekJoonETC._1Bronze;
//https://www.acmicpc.net/problem/2475 - 검증수

import java.io.IOException;

public class P2475 {
    public static void main(String[] args) throws IOException {
        int c = System.in.read();
        int sum = 0;
        while(c!=10) {
            if(c!=32) {
                sum += (c-48)*(c-48);
            }
            c = System.in.read();
        }
        System.out.println(sum%10);
    }
}
