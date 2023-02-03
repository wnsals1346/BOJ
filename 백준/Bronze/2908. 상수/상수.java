import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] num = br.readLine().split(" ");

        if(num[0].charAt(2)>num[1].charAt(2)) {
            bw.write(String.valueOf(num[0].charAt(2)));
            bw.write(String.valueOf(num[0].charAt(1)));
            bw.write(String.valueOf(num[0].charAt(0)));
        } else if(num[0].charAt(2)<num[1].charAt(2)) {
            bw.write(String.valueOf(num[1].charAt(2)));
            bw.write(String.valueOf(num[1].charAt(1)));
            bw.write(String.valueOf(num[1].charAt(0)));
        } else {
            if(num[0].charAt(1)>num[1].charAt(1)) {
                bw.write(String.valueOf(num[0].charAt(2)));
                bw.write(String.valueOf(num[0].charAt(1)));
                bw.write(String.valueOf(num[0].charAt(0)));
            } else if(num[0].charAt(1)<num[1].charAt(1)) {
                bw.write(String.valueOf(num[1].charAt(2)));
                bw.write(String.valueOf(num[1].charAt(1)));
                bw.write(String.valueOf(num[1].charAt(0)));
            } else {
                if(num[0].charAt(0)>num[1].charAt(0)) {
                    bw.write(String.valueOf(num[0].charAt(2)));
                    bw.write(String.valueOf(num[0].charAt(1)));
                    bw.write(String.valueOf(num[0].charAt(0)));
                } else {
                    bw.write(String.valueOf(num[1].charAt(2)));
                    bw.write(String.valueOf(num[1].charAt(1)));
                    bw.write(String.valueOf(num[1].charAt(0)));
                }
            }
        }
        bw.close();
    }
}
