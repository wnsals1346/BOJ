package BaekJoonStep.s20;
//https://www.acmicpc.net/problem/1541 - 잃어버린 괄호

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        List<Integer> num= new ArrayList<>();
        List<Character> oper = new ArrayList<>();
        int start = 0, count = 0;
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='-' || str.charAt(i)=='+') {
                num.add(Integer.parseInt(str.substring(start,i)));
                start = i+1;
                if(str.charAt(i)=='-' && !flag) flag = true;
                if(str.charAt(i)=='+' && !flag) {
                    count++;
                }
            }
        }
        num.add(Integer.parseInt(str.substring(start)));
        int res = 0;
        for (int i = 0; i <= count; i++) {
            res += num.get(i);
        }
        for (int i = count+1; i < num.size(); i++) {
            res -= num.get(i);
        }
        System.out.println(res);

    }
}
