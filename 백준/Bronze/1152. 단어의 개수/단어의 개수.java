import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int cnt = 0;
        char pre = ' ';
        char c = (char) System.in.read();

        while(c!='\n') {
            if(c!=' '&&pre==' ') {
                cnt++;
            }
            pre = c;
            c = (char) System.in.read();
        }
        System.out.println(cnt);
    }
}