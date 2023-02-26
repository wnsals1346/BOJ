package BaekJoonETC._3Gold;
//https://www.acmicpc.net/problem/1339 - 단어 수학

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P1339 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];
        int[] al = new int[26];

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            words[i] = word;
            for (int j = 0; j < word.length(); j++) {
                int c = word.charAt(j);
                al[c-'A'] += (int)Math.pow(10,word.length()-1-j);
            }
        }

        ArrayList<Alphabet> list = new ArrayList<>();
        for (int i = 0; i < al.length; i++) {
            if(al[i]!=0) list.add(new Alphabet(i,al[i]));
        }
        Collections.sort(list);
        int num = 9;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            al[list.remove(0).al] = num--;
        }

        int res = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                int c = word.charAt(j);
                res += al[c-'A']*(int)Math.pow(10,word.length()-1-j);
            }
        }
        System.out.println(res);
    }
    public static class Alphabet implements Comparable<Alphabet>{
        int al;
        int val;

        public Alphabet(int al, int val) {
            this.al = al;
            this.val = val;
        }

        @Override
        public int compareTo(@NotNull Alphabet o) {
            return o.val - this.val;
        }

        @Override
        public String toString() {
            return "Alphabet{" +
                    "al=" + al +
                    ", val=" + val +
                    '}';
        }
    }

}
