import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        HashSet<String> hs = new HashSet<>();
        for (int length = 1; length <= s.length(); length++) {
            for (int j = 0; j <= s.length() - length; j++) {
                hs.add(s.substring(j,j+length));
            }
        }
        System.out.println(hs.size());

    }
}
