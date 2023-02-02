package BaekJoonStep.s4;
//https://www.acmicpc.net/problem/10818 - 최소,최대

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bw.readLine());


        String[] arr  = bw.readLine().split(" ");

        int[] intarr = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(intarr);
        System.out.printf("%d %d",intarr[0],intarr[intarr.length-1]);
    }
}


