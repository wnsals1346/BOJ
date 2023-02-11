package BaekJoonETC._1Bronze;
//https://www.acmicpc.net/problem/1264 - 모음의 개수

import java.io.IOException;

public class P1264 {
    public static void main(String[] args) throws IOException {
        int c = System.in.read();
        int cnt = 0;
        while(c!=35) {
            if(c==10) {
                System.out.println(cnt);
                cnt = 0;
            }//.toLowerCase();를 써서 소문자로 바꾸면 더 간단하다.
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') cnt++;
            c = System.in.read();
        }
    }
}
