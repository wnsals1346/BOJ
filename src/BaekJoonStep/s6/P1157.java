package BaekJoonStep.s6;
//https://www.acmicpc.net/problem/1157 - 단어 공부

import java.io.IOException;
import java.util.*;

public class P1157 {
    public static void main(String[] args) throws IOException {
        int[] al = new int[26];
        int c = System.in.read();

        while(c>64) {
            if(c>96) {
                al[c-97]++;
            } else {
                al[c-65]++;
            }
            c = System.in.read();
        }

        int max = -1;
        int ch = -2;
        for(int i=0;i<26;i++) {
            if(al[i]>max) {
                max = al[i];
                ch = i;
            } else if(al[i]==max) {
                ch = -2;
            }
        }
        System.out.println((char)(ch+65));

    }
}


/* Scanner in = new Scanner(System.in);
        String str = in.next().toLowerCase();
        String[] arr = str.split("");
        ArrayList<String> arrlist = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            if(!arrlist.contains(arr[i])) arrlist.add(arr[i]);
        }
        System.out.println(arrlist.toString());
        int[] cnt = new int[arrlist.size()];
        for(int i=0;i<cnt.length;i++) {
            cnt[i] = Collections.frequency(Arrays.asList(arr),arrlist.get(i));
        }
        String out = arrlist.get(0);
        int max = cnt[0];
        for(int i=1;i<arrlist.size();i++) {
            if(cnt[i]>max) {
                max = cnt[i];
                out = arrlist.get(i);
            } else if(cnt[i]==max) {
                out = "?";
            }
        }
        System.out.println(out.toUpperCase());*/