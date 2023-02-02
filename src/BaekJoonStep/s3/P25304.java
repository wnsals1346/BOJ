package BaekJoonStep.s3;
//https://www.acmicpc.net/problem/25304 - 영수증

import java.io.*;
import java.util.StringTokenizer;

public class P25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalPrice = Integer.parseInt(br.readLine());
        int nOfProduct = Integer.parseInt(br.readLine());
        int cal = 0;
        StringTokenizer st;

        for(int i=0; i<nOfProduct; i++) {
            st = new StringTokenizer(br.readLine());
            cal += Integer.parseInt(st.nextToken())*Integer.parseInt(st.nextToken());
        }

        if(cal==totalPrice) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }
        br.close();
        bw.close();
    }
}
