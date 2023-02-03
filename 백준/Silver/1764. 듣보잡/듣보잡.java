import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hm = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        while(n-->0) {
            hm.put(br.readLine(),0);
        }
        StringBuilder sb = new StringBuilder();
        String str;
        TreeSet<String> treeSet = new TreeSet<>();
        while(m-->0) {
            str = br.readLine();
            if(hm.containsKey(str)) {
                treeSet.add(str);
                cnt++;
            }
        }
        System.out.println(treeSet.size());
        for (String s : treeSet) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);

    }
}
