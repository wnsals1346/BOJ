import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<30; i++) {
            arr.add(i+1);
        }
        String str;
        while((str = br.readLine()) != null && str.length() != 0) {
            arr.remove(arr.indexOf(Integer.parseInt(str)));
        }
        System.out.println(arr.get(0)+"\n"+arr.get(1));
    }
}
