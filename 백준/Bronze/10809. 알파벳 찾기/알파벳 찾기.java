import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        ArrayList<String> arrlist = new ArrayList<>(Arrays.asList(str.split("")));

        for(char c='a';c<='z';c++) {
            if(arrlist.contains(String.valueOf(c))) System.out.print(arrlist.indexOf(String.valueOf(c))+" ");
            else System.out.print("-1 ");
        }
    }
}