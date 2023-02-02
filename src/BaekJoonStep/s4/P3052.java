package BaekJoonStep.s4;
//https://www.acmicpc.net/problem/3052 - 나머지

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


public class P3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hset = new HashSet<>();

        for(int i=0;i<10;i++) {
            hset.add(Integer.parseInt(br.readLine())%42);
        }

        System.out.println(hset.size());
    }
}


/**
 * ArrayList<Integer> list = new ArrayList<>();
 * Arrays.stream(arr).forEach(list::add);
 * int[]를 Integer Object로 바꾸는법  int[]를 hashset에 넣으려고 Arrays.asList했더니 에러남 String은 됨. Object니까
 */