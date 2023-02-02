package BaekJoonStep.s14;
//https://www.acmicpc.net/problem/2477 = 참외밭

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2477 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[][] arr = new int[6][2];
        int[] cnt = new int[5];
        StringTokenizer st;
        //큰 사각형 - 외부 작은 사각형 넓이로 육각형 넓이 계산
        //큰 변의 길이 찾기, 한번만 이동한 방향은 큰 변
        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            cnt[arr[i][0]]++;
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        //큰 사각형 넓이
        int bigArea = 1;
        int smlArea = 1;
        for (int i = 1; i < cnt.length; i++) {
            if(cnt[i]==1) {
                for (int j = 0; j < arr.length; j++) {
                    if(arr[j][0]==i) { //j가 큰변 idx
                        bigArea *= arr[j][1];
                        //외부 작은 사각형 변은 큰변idx+3, 평행하니까
                        smlArea *= arr[(j+3)%arr.length][1];
                        break;
                    }
                }
            }
        }
        int ans = (bigArea-smlArea)*num;
        System.out.println(ans);
    }
}
