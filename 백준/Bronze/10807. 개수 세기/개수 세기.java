import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(str.split(" ")));
        String s = br.readLine();

        bw.write(String.valueOf(Collections.frequency(arr,s)));
        bw.close();
    }
}