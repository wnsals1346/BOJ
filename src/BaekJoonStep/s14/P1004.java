package BaekJoonStep.s14;
//https://www.acmicpc.net/problem/1004 - 어린 왕자

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


        while(c-->0) {
            int x1, y1, x2, y2; //출발, 도착 지점
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());

            int n = Integer.parseInt(br.readLine()); //행성계 수
            int ans = 0;
            while(n-->0) {
                st = new StringTokenizer(br.readLine());
                ans += checkRoute(x1, y1, x2, y2, Integer.parseInt(st.nextToken()),
                        Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

            }
            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }
    static int checkRoute(int x1, int y1, int x2, int y2, int cx, int cy, int r) {
        double distanceCto1 = Math.pow(x1-cx,2)+Math.pow(y1-cy,2);
        double distanceCto2 = Math.pow(x2-cx,2)+Math.pow(y2-cy,2);
        int r_square = r*r;
        if(distanceCto1>r_square && distanceCto2>r_square) {
            return 0;
        }
        else if (distanceCto1<r_square && distanceCto2<r_square) {
            return 0;
        }
        else return 1;
    }
}
