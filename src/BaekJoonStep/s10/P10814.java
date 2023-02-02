package BaekJoonStep.s10;
//https://www.acmicpc.net/problem/10814 -나이순 정렬

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class P10814 {
    public static class Member implements Comparable<Member> {
        int age;
        String name;
        Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
        @Override
        public int compareTo(Member m) {
            if(this.age<m.age) return -1;
            else if (this.age==m.age) return 0;
            else return 1;
        }
        @Override
        public String toString() {
            return age+" "+name+"\n";
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        ArrayList<Member> marr = new ArrayList<>();
        StringTokenizer st;
        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            marr.add(new Member(Integer.parseInt(st.nextToken()),st.nextToken()));//Member(age, name)
        }
        Collections.sort(marr);
        for (Member m : marr) {
            sb.append(m);
        }

        System.out.println(sb);
    }
}
