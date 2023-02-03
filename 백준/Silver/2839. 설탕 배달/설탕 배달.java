import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int big = 0;
         int small = 0;
         int total = -1;

         if(n%5==0) {
             big = n/5;
         } else {
             int k = n/5;
             while(k>0) {
                 if((n-5*k)%3==0) {
                     big = k;
                     small = (n-5*k)/3;
                     break;
                 }
                 k--;
             }
             if(k==0&&n%3==0) {
                 small = n/3;
             }
         }
         if(big!=0||small!=0) {
             total = big+small;
         }
        System.out.println(total);
    }
}
