import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        while(c-1>0) {
            int r = Integer.parseInt(st.nextToken());
            if(first<=r) {
                if(r%first==0) {
                    sb.append("1/").append(r/first).append("\n");
                } else {
                    sb.append(first/sol(first, r)).append("/").append(r/sol(first, r)).append("\n");
                }
            } else {
                if(first%r==0) {
                    sb.append(first/r).append("/1").append("\n");
                } else {
                    sb.append(first/sol(first, r)).append("/").append(r/sol(first, r)).append("\n");
                }
            }
            c--;
        }
        System.out.println(sb);
    }
    static int sol(int a, int b) {
        int r;
        while(b!=0) {
            r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
}
