import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int sum = 0;
            int score = 0;
            int count = 0;
            ArrayList<Integer> arr = new ArrayList<>();
            while(st.hasMoreTokens()) {
                score = Integer.parseInt(st.nextToken());
                arr.add(score);
                sum += score;
            }
            float avg = (float)sum/(float)num;

            for(int s : arr) {
                if(s>avg) count++;
            }
            float ratio = (float)count/num*100;
            bw.write(String.format("%.3f",ratio)+"%");
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}