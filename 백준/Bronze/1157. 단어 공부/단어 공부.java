import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        int[] al = new int[26];
        int c = System.in.read();

        while(c>64) {
            if(c>96) {
                al[c-97]++;
            } else {
                al[c-65]++;
            }
            c = System.in.read();
        }

        int max = -1;
        int ch = -2;
        for(int i=0;i<26;i++) {
            if(al[i]>max) {
                max = al[i];
                ch = i;
            } else if(al[i]==max) {
                ch = -2;
            }
        }
        System.out.println((char)(ch+65));

    }
}
