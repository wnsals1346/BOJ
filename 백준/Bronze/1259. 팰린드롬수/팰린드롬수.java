import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in;
        StringBuilder sb = new StringBuilder();
        boolean isPNum;
        while(true) {
            isPNum = true;
            in = br.readLine();
            if(Integer.parseInt(in)==0) break;
            for (int i = 0; i < in.length()/2; i++) {
                if(in.charAt(i)!=in.charAt(in.length()-1-i)) {
                    sb.append("no").append("\n");
                    isPNum = false;
                    break;
                }
            }
            if(isPNum) sb.append("yes").append("\n");
        }
        System.out.println(sb);
    }

}
