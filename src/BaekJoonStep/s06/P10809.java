package BaekJoonStep.s06;
////https://www.acmicpc.net/problem/10809 - 알파벳 찾기
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P10809 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        ArrayList<String> arrlist = new ArrayList<>(Arrays.asList(str.split("")));

        for(char c='a';c<='z';c++) {
            if(arrlist.contains(String.valueOf(c))) System.out.print(arrlist.indexOf(String.valueOf(c))+" ");
            else System.out.print("-1 ");
        }
    }
}
