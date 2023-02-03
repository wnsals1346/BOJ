import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] t = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
        int c = System.in.read();
        int time = 0;
        while(c>64) {
            time += t[c-65];
            c = System.in.read();
        }
        System.out.println(time);
    }
}
