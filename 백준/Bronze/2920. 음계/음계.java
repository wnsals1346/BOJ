import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int c = System.in.read();
        int prev = c;
        boolean ad = true;
        boolean asc = true;
        while(true) {
            c = System.in.read();
            if(c==10) break;
            if(c==32) continue;
            if((c-prev)==1) {
                asc = true;
            } else if((c-prev)==-1) {
                asc = false;
            } else {
                ad = false;
                break;
            }
            prev = c;
        }
        if(asc&&ad) bw.write("ascending");
        else if((!asc)&&ad) bw.write("descending");
        else bw.write("mixed");
        bw.close();
    }
}
