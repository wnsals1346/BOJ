import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = sc.nextInt();
        for(int i=1;i<= n;i++){
            bw.write(" ".repeat(n-i));
            bw.write("*".repeat(i));
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}