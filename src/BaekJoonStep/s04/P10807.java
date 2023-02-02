package BaekJoonStep.s04;
//https://www.acmicpc.net/problem/10807 - 개수 세기

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class P10807 {
    public static void main(String[] args) throws IOException {
        solOne10807 a = new solOne10807();
        solTwo10807 b = new solTwo10807();
        //a.solOne();
        b.solTwo();
    }

}

class solOne10807 {
    public void solOne() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(str.split(" ")));
        String s = br.readLine();

        while(arr.contains(s)) {
            arr.remove(s);
            count++;
        }

        bw.write(String.valueOf(count));
        bw.close();
    }
}

class solTwo10807 {
    public void solTwo() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(str.split(" ")));
        String s = br.readLine();

        bw.write(String.valueOf(Collections.frequency(arr,s)));
        bw.close();
    }
}