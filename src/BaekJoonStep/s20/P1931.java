package BaekJoonStep.s20;
//https://www.acmicpc.net/problem/1931 - 회의실 배정

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Meeting[] m = new Meeting[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            m[i] = new Meeting(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        Arrays.sort(m);
        int start, end= m[0].end, count = 1;

        for (int i = 1; i < n; i++) {
            if(end==m[i].end && end!=m[i].start) continue;
            if(end<=m[i].start) {
                end = m[i].end;
                count++;
            }
        }
        System.out.println(count);


    }
    public static class Meeting implements Comparable<Meeting> {
        int start;
        int end;

        public Meeting(int start, int end)  {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Meeting o) {
            if(this.end!=o.end) return this.end-o.end;
            else return this.start - o.start;
        }
    }
}
