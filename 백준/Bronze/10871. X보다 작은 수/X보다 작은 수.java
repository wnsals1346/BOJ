import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int t = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        String s2 = br.readLine();
        String array[] = s2.split(" ");
        for(int i=0;i<t;i++) {
            bw.write((Integer.parseInt(array[i])<n)?array[i]+" ":"");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}