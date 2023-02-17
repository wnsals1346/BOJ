package BaekJoonETC._3Gold;
//https://www.acmicpc.net/problem/2015 - 가장 긴 증가하는 부분 수열 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P12015 {
    static ArrayList<Integer> dp = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        dp.add(Integer.parseInt(st.nextToken()));
        t--;
        while(t-->0) {
            bs(Integer.parseInt(st.nextToken()));
        }
        System.out.println(dp.size());
    }
    public static void bs(int n) {
        int left = 0, right = dp.size()-1, mid;
        if(n>dp.get(right)) {
            dp.add(n);
        } else {
            while(left<=right) {
                mid = (left + right) / 2;
                if(dp.get(mid)==n) {
                    return;
                } else if(n<dp.get(mid)) {
                    right = mid-1;
                } else {
                    left = mid+1;
                }
            }
            dp.set(left,n);
        }

    }
}
