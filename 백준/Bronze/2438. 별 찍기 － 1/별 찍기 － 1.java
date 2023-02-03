import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = sc.nextInt();
        int s = 1;
        for(;n>0;n--){
            for(int i=0;s>i;i++){
                bw.write("*");
            }
            bw.write("\n");
            s++;
        }
        bw.flush();
        bw.close();
    }
}
