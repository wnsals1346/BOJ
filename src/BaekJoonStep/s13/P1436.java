package BaekJoonStep.s13;
//https://www.acmicpc.net/problem/1436 - 영화감독 숌

import java.util.Scanner;

public class P1436 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int cnt = 0;
      int num = 666;
      String str;
      while(true) {
          str = String.valueOf(num);
          for (int i = 0; i < str.length()-2; i++) {
              if(str.charAt(i)=='6' && str.charAt(i+1)=='6' && str.charAt(i+2)=='6') {
                  cnt++;
                  break;

              }
          }
          if(n==cnt) {
              break;
          }
          num++;
      }
        System.out.println(num);
    }

}
