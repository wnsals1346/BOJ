import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bw.readLine());
        String s = bw.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int max = Integer.parseInt(st.nextToken());
        int min = max;

        for(int i=1;i<n;i++) {
            int nn = Integer.parseInt(st.nextToken());
            if (nn>max) {
                max = nn;
            }
            else if (nn<min) {
                min = nn;
            }
        }
        System.out.printf("%d %d",min,max);
    }
}
