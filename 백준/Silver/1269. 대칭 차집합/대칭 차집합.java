import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashSet<String> hs = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        while(n-->0) {
            hs.add(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        String s;
        while(m-->0) {
            s = st.nextToken();
            if(hs.contains(s)) hs.remove(s);
            else hs.add(s);
        }
        System.out.println(hs.size());
    }
}
