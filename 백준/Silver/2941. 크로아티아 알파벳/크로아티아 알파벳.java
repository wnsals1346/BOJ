import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int al = System.in.read();
        int pre = 0;
        int cnt = 0;
        boolean dz = false;

        while(al!=10) {
            if(dz==true) {
                if(al=='=') {
                    dz = false;
                    cnt--;
                }
                else {
                    dz = false;
                }
            }
            if(97<=al && al<=122) {
                cnt++;
                if(pre==100 && al==122) {
                    dz = true;
                } else if((pre==108 || pre==110) && al==106) {
                    cnt--;
                } 
            }
            pre = al;
            al = System.in.read();
        }
        System.out.println(cnt);
    }
}
