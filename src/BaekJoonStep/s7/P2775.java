package BaekJoonStep.s7;
//https://www.acmicpc.net/problem/2775 = 부녀회장이 될테야

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(;n>0;n--) {
            System.out.println(solution(Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine())));
        }

    }

    static int solution(int k, int n) {
        // sum = 0;
        if(n==1) {
            return 1;
        } else if(k==0) {
            return n;
        } else {
            /*for(int i=0;i<n+1;i++) {
                sum += solution(k-1,i);
            }*/
            return solution(k-1,n)+solution(k,n-1);
        }
    }
}
