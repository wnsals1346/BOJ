package BaekJoonStep.s6;
////https://www.acmicpc.net/problem/1152 - 단어의 개수

import java.io.*;

public class P1152 {
    public static void main(String[] args) throws IOException {
        int cnt = 0;
        char pre = ' ';
        char c = (char) System.in.read();

        while(c!='\n') {
            if(c!=' '&&pre==' ') {
                cnt++;
            }
            pre = c;
            c = (char) System.in.read();
        }
        System.out.println(cnt);
    }
}



/*
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
StringTokenizer st = new StringTokenizer(br.readLine()," ");
int cnt = 0;
String s;
while(st.hasMoreTokens()&&(s=st.nextToken())!=null) {
    cnt++;
}
bw.write(String.valueOf(cnt));
bw.close();
 */
/*
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
String[] str = br.readLine().split(" ");
int off = 0;
for(String s : str) {
    if(s.equals("")) off--;
}
bw.write(String.valueOf(str.length+off));
bw.close();
*/