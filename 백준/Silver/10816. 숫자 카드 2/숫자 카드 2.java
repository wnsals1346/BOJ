import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        final int N = 20000001;
        int[] cnt = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(n-->0) {
            cnt[Integer.parseInt(st.nextToken())+N/2]++;
        }
        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(m-->0) {
            sb.append(cnt[Integer.parseInt(st.nextToken())+N/2]).append(" ");
        }
        System.out.println(sb);
    }
}
