import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer time = new StringTokenizer(br.readLine(), " ");
        int required = Integer.parseInt(br.readLine());
        int hour = Integer.parseInt(time.nextToken());
        int min = Integer.parseInt(time.nextToken());
        int rhour = required/60;
        int rmin = required%60;
        int chour,cmin;
        
        chour = hour + rhour;
        cmin = min + rmin;
        if(cmin>=60) {
            chour += 1;
            cmin -= 60;
        }
        if(chour >= 24) {
            chour -= 24;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(chour).append(" ").append(cmin);
        bw.write(sb.toString());
        bw.close();
    }
}