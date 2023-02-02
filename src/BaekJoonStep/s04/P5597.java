package BaekJoonStep.s04;
//https://www.acmicpc.net/problem/5597 - 과제 안 내신 분..?

import java.io.*;
import java.util.ArrayList;

public class P5597 {
    public static void main(String[] args) throws IOException {
        solTwo5597 a = new solTwo5597();
        a.solTwo();
    }
}

class solOne5597 {
    public void solOne() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<30; i++) {
            arr.add(i+1);
        }
        String str;
        while((str = br.readLine()) != null && str.length() != 0) {
            arr.remove(arr.indexOf(Integer.parseInt(str)));
        }
        System.out.println(arr.get(0)+"\n"+arr.get(1));
    }
}

class solTwo5597 {
    public void solTwo() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[31];

        String str;
        while((str = br.readLine()) != null && str.length() != 0) {
            arr[Integer.parseInt(str)] = true;
        }
        for (int i=1; i<=30; i++) {
              if (!arr[i]) System.out.println(i);
          }
    }
}

