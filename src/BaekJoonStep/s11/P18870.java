package BaekJoonStep.s11;
//https://www.acmicpc.net/problem/18870 - 좌표 압축

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hashSet = new HashSet<>();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] buffer = new int[n];
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            hashSet.add(num);
            buffer[i] = num;
        }
        ArrayList<Integer> arl = new ArrayList<>(hashSet);
        Collections.sort(arl);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(binarySearch(arl,buffer[i])).append(" ");
        }
        System.out.println(sb);
    }
    static int binarySearch (ArrayList<Integer> arl, int ans) {
        int left = 0, mid = 0, right = arl.size();
        while(left<=right) {
            mid = (left+right)/2;
            if(ans==arl.get(mid)) return mid;
            else if (ans<arl.get(mid)) right = mid-1;
            else left = mid + 1;
        }
        throw new NoSuchElementException("No exists");
    }
}
