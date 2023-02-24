package BaekJoonStep.s09;
//https://www.acmicpc.net/problem/9506 - 약수들의 합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class P9506 {
    public static void main(String[] args) throws IOException {
        final String equal = " = ";
        final String plus = " + ";
        final String not = " is NOT perfect.";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(num!=-1) {
            ArrayList<Integer> list = new ArrayList<>();
            int sum = 1;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if(num%i==0 && i!=num/i) {
                    list.add(i);
                    list.add(num/i);
                    sum += i+num/i;
                } else if (num%i==0) {
                    sum += i;
                    list.add(i);
                }
            }
            Collections.sort(list);
            if(num==sum) {
                sb.append(num).append(equal).append(1).append(plus);
                for (int i = 0; i < list.size()-1; i++) {
                    sb.append(list.get(i)).append(plus);
                }
                sb.append(list.get(list.size()-1)).append("\n");
            } else {
                sb.append(num).append(not).append("\n");
            }
            num = Integer.parseInt(br.readLine());
        }
        System.out.println(sb);
    }
}

