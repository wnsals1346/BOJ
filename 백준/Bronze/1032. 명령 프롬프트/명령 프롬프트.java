import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] name = new boolean[50];
        int c = Integer.parseInt(br.readLine());
        char[] file = br.readLine().toCharArray();
        c--;
        String str;
        while(c-->0) {
            str = br.readLine();
            for (int i = 0; i < str.length(); i++) {
                if(name[i]) continue;
                if(file[i]!=str.charAt(i)) name[i] = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < file.length; i++) {
            if(!name[i]) sb.append(file[i]);
            else sb.append('?');
        }
        System.out.println(sb);
    }
}
