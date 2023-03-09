package BaekJoonStep.s17;
//https://www.acmicpc.net/problem/14889 - 스타트와 링크

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14889 {
    static int[][] point;
    static int[] team;
    static int[] teamTwo;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        point = new int[N][N];
        team = new int[N/2];
        teamTwo = new int[N/2];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                point[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        makeTeam(0, N, 0, 0);
        System.out.println(min);

    }
    public static void makeTeam(int start, int n, int k, int score_one) {

        if(k==n/2) {
            for (int i = 0; i < teamTwo.length; i++) {
                for (int j = 0; j < n; j++) {
                    if(check(team,j)&&check(teamTwo,j)) {
                        teamTwo[i] = j;
                        break;
                    }
                }
            }
            int score_two = 0;
            for (int i = 0; i < teamTwo.length-1; i++) {
                for (int j = i+1; j < teamTwo.length; j++) {
                    score_two += point[teamTwo[i]][teamTwo[j]]+point[teamTwo[j]][teamTwo[i]];
                }
            }
            int diff = Math.abs(score_one - score_two);
            min = Math.min(min,diff);
        }
        else {
            for (int i = start; i < n; i++) {
                team[k] = i;
                makeTeam(i+1, n,k+1, cal(i, k, score_one));
            }
        }
    }
    public static int cal(int i, int k, int score_one) {
        for (int j = 0; j < k; j++) {
            score_one += point[i][team[j]]+point[team[j]][i];
        }
        return score_one;
    }
    public static boolean check(int[] arr, int i) {
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]==i) return false;
        }
        return true;
    }
}
