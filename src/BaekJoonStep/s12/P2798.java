package BaekJoonStep.s12;
//https://www.acmicpc.net/problem/2798 - 블랙잭

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[Integer.parseInt(st.nextToken())];
        int black = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int selec;
        int max = 0;
        Start : for (int i = 0; i < arr.length-2; i++) {
            if(arr[i]>=black) continue;
            for (int j = i+1; j < arr.length-1; j++) {
                if(arr[i]+arr[j]>=black) continue;
                for (int k = j+1; k < arr.length; k++) {
                    selec = arr[i]+arr[j]+arr[k];
                    if(selec==black) {
                        max = selec;
                        break Start;
                    }
                    else if(selec<black) {
                        max = Math.max(selec,max);
                    }
                }
            }
        }
        System.out.println(max);
    }
}
