import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int c = 1;
        for(;n>0;n--){
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write("Case #"+c+": ");
            bw.write(a+b+"\n"); //a+b만하면 아스키코드로 나오고 +"\n"추가시 스트링 값으로 나옴. String.valueOf(a+b)도 가능하다.
            c++;
        }
        br.close();
        bw.flush();
        bw.close();
    }
}