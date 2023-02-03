import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int c = System.in.read();
        int[] cnt = new int[10];
        StringBuilder sb = new StringBuilder();
        while(c!=10) {
            cnt[c-48]++;
            c = System.in.read();
        }
        for(int i=cnt.length-1;i>=0;i--) {
            while(cnt[i]>0) {
                cnt[i]--;
                sb.append(i);
            }
        }
        System.out.println(sb);
    }
}
