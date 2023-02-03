import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = sc.nextInt();
        for(int i=1;n>=i;i++) {
            bw.write(i+"\n");
        }
        bw.flush();
        bw.close();
    }
}
