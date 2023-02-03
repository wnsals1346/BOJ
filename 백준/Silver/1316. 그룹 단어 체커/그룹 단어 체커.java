import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] al;
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(;n>0;n--) {
            al = new int[26];
            String word = br.readLine();
            for(int i=0;i<word.length();i++) {
                int loc = word.charAt(i)-97;
                if(al[loc]==0) {
                    al[loc]=i+1;
                } else if((al[loc]-(i+1))==-1) {
                    al[loc]=i+1;
                } else {
                    cnt--;
                    break;
                }
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
