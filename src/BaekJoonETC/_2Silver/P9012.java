package BaekJoonETC._2Silver;
//https://www.acmicpc.net/problem/9012 - 괄호

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String str;
        int i;
       while(n-->0) {
           str = br.readLine();
           i = 1;
           while(i<str.length()) {
               if(str.charAt(i-1)==40 && str.charAt(i)==41) {
                   str = str.substring(0,i-1)+str.substring(i+1);
                   i=1;
               } else {
                   i++;
               }

           }
           if(str.equals("")) sb.append("YES").append("\n");
           else sb.append("NO").append("\n");

       }

        System.out.println(sb);

    }
}
