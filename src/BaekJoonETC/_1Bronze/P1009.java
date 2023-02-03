package BaekJoonETC._1Bronze;
//https://www.acmicpc.net/problem/1009 - 분산처리

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrayList;
        while (n-- > 0) {
            String str = br.readLine();
            int a = Integer.parseInt(str.split(" ")[0]);
            int b = Integer.parseInt(str.split(" ")[1]);
            int res = a % 10;
            arrayList = new ArrayList<>();
            while (!arrayList.contains(res)) {
                arrayList.add(res);
                res = (res * (a % 10)) % 10;
            }
            int idx = b % arrayList.size();
            if (idx == 0) {
                if (arrayList.get(arrayList.size() - 1) == 0) {
                    System.out.println(10);
                } else {
                    System.out.println(arrayList.get(arrayList.size() - 1));
                }
            } else {
                System.out.println(arrayList.get(idx - 1));
            }
        }
    }
}
