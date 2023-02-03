import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hset = new HashSet<>();

        for(int i=0;i<10;i++) {
            hset.add(Integer.parseInt(br.readLine())%42);
        }

        System.out.println(hset.size());
    }
}
