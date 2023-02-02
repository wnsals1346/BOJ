package BaekJoonStep.s6;
//https://www.acmicpc.net/problem/2908 - 상수

import java.io.*;

public class P2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] num = br.readLine().split(" ");

        if(num[0].charAt(2)>num[1].charAt(2)) {
            for(int i=2;i>=0;i--) {
                bw.write(String.valueOf(num[0].charAt(i)));
            }
        } else if(num[0].charAt(2)<num[1].charAt(2)) {
            for(int i=2;i>=0;i--) {
                bw.write(String.valueOf(num[1].charAt(i)));
            }
        } else {
            if(num[0].charAt(1)>num[1].charAt(1)) {
                for(int i=2;i>=0;i--) {
                    bw.write(String.valueOf(num[0].charAt(i)));
                }
            } else if(num[0].charAt(1)<num[1].charAt(1)) {
                for(int i=2;i>=0;i--) {
                    bw.write(String.valueOf(num[1].charAt(i)));
                }
            } else {
                if(num[0].charAt(0)>num[1].charAt(0)) {
                    for(int i=2;i>=0;i--) {
                        bw.write(String.valueOf(num[0].charAt(i)));
                    }
                } else {
                    for(int i=2;i>=0;i--) {
                        bw.write(String.valueOf(num[1].charAt(i)));
                    }
                }
            }
        }
        bw.close();
    }
}
