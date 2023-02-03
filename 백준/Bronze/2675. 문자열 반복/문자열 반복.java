import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr;
        int n = in.nextInt();
        for(;n>0;n--) {
            int repeat = in.nextInt();
            arr = in.next().split("");
            for(int i=0;i<arr.length;i++) {
                System.out.print(arr[i].repeat(repeat));
            }
            System.out.println("");

        }

    }
}