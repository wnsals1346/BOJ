package BaekJoonStep.s18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P11054 {
    static ArrayList<Integer> dp_asc;
    static ArrayList<Integer> dp_desc;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        dp_asc = new ArrayList<>();
        dp_desc = new ArrayList<>();
        int t = Integer.parseInt(br.readLine());
        int[] arr = new int[t];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < t; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            asc(arr[i]);
            for (int j = i+1; j < arr.length; j++) {
                desc(arr[j]);
            }
            if(!dp_asc.isEmpty()&&!dp_desc.isEmpty()) {
                if(dp_asc.get(dp_asc.size()-1)==dp_desc.get(0)) {
                    dp_desc.remove(0);
                }
            }

            max = Math.max(max,dp_asc.size()+dp_desc.size());
            System.out.println(dp_asc+" "+dp_desc);
            dp_desc.clear();
        }
        System.out.println(max);



    }
    public static void asc(int n) {

        if(dp_asc.isEmpty()) {
            dp_asc.add(n);
            return;
        }

        int left = 0, right = dp_asc.size()-1, mid;

        if(dp_asc.get(right)<n) {
            dp_asc.add(n);
            return;
        }
        while(left<=right) {
            mid = (left+right) / 2;
            if (n==dp_asc.get(mid)) {
                return;
            } else if(n<dp_asc.get(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        dp_asc.set(left, n);
    }
    public static void desc(int n) {

        if(dp_desc.isEmpty()) {
            dp_desc.add(n);
            return;
        }

        int left = 0, right = dp_desc.size()-1, mid;

        if(dp_desc.get(right)>n) {
            dp_desc.add(n);
            return;
        }
        while(left<=right) {
            mid = (left+right) / 2;
            if (n==dp_desc.get(mid)) {
                return;
            } else if(n<dp_desc.get(mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        dp_desc.set(left, n);
    }

}
