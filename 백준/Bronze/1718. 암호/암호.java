import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        String key = br.readLine();
        char d = 96;
        int en;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)==32) {
                bw.write(str.charAt(i));
                continue;
            }
            en = str.charAt(i)-(key.charAt(i%key.length())-d);
            if(en<97) {
                en += 26;
            }
            bw.write(en);
        }
        bw.flush();
    }
}
