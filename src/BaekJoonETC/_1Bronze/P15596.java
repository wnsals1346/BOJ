package BaekJoonETC._1Bronze;
//https://www.acmicpc.net/problem/15596 - 정수 N개의 합
public class P15596 {
    public static void main(String[] args) {

    }

    long sum(int[] a) {
        int ans = 0;
        for(int i=0;i<a.length;i++) {
            ans += a[i];
        }
        return ans;
    }
}
