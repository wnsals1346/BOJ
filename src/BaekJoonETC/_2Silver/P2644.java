package BaekJoonETC._2Silver;
//https://www.acmicpc.net/problem/2644 - 촌수계산

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P2644 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int v = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken())-1;
        int b = Integer.parseInt(st.nextToken())-1;
        int e = Integer.parseInt(br.readLine());
        int[][] matrix = new int[v][v];
        boolean[] visited = new boolean[v];

        while(e-->0) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken())-1;
            int c = Integer.parseInt(st.nextToken())-1;
            matrix[p][c] = matrix[c][p] = 1;
        }

        ArrayList<Person> queue = new ArrayList<>();
        queue.add(new Person(a,0));
        visited[a] = true;

        int res = 0;
        while(queue.size()!=0) {
            Person cur = queue.remove(0);
            res++;
            for (int i = 0; i < v; i++) {
                if(matrix[cur.num][i]!=0 && !visited[i]) {
                    queue.add(new Person(i,cur.dist+1));
                    visited[i] = true;
                    if(i==b) {
                        System.out.println(cur.dist+1);
                        return;
                    }

                }
            }
        }
        System.out.println(-1);

    }
    public static class Person {
        int num;
        int dist;

        public Person(int num, int dist) {
            this.num = num;
            this.dist = dist;
        }
    }
}
