package BaekJoonStep.s06;
//https://www.acmicpc.net/problem/4344 - 평균은 넘겠지

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int sum = 0;
            ArrayList<Integer> arr = new ArrayList<>();

            while(st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
                sum += arr.get(arr.size()-1);
            }

            float avg = (float)sum/(float)num;
            int cnt = 0;

            for(int s : arr) {
                if(s>avg) cnt++;
            }

            bw.write(String.format("%.3f",(float)cnt/num*100)+"%");
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
