import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int max = sc.nextInt();
        arr.add(max);
        int num = max;

        while(sc.hasNextInt()) {
            num = sc.nextInt();
            arr.add(num);
            max = (num>max)?num:max;
        }

        System.out.println(max+"\n"+(arr.indexOf(max)+1));
    }
}