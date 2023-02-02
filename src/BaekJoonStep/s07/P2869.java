package BaekJoonStep.s07;
//https://www.acmicpc.net/problem/2869 - 달팽이는 올라가고 싶다

import java.io.*;
import java.util.StringTokenizer;

public class P2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int day;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        day = (V-B)/(A-B);
        if((V-B)%(A-B)!=0) day++;
        bw.write(String.valueOf(day));
        bw.close();
    }
}
