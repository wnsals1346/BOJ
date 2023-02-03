import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ans = 0;
        for(;N>0;N--) {
            ans += sol(Integer.parseInt(st.nextToken()));
        }
        System.out.println(ans);
    }
    static int sol(int num) {
        int end = num/2;
        if(num==1) return 0;
        for(int i=2;i<=end;i++) {
            if(num%i==0) {
                return 0;
            }
        }
        return 1;
    }
}
