import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean[] p = new boolean[10001];
        primeFinder(p);
        int n = in.nextInt();
        for(;n>0;n--) {
            int num = in.nextInt();
            for(int i=num/2;i<num-1;i++) {
                if(!p[i]&&!p[num-i]) {
                    System.out.println((num-i)+" "+i);
                    break;
                }
            }
        }



    }
    static void primeFinder(boolean[] prime) {
        prime[0] = prime[1] = true;
        for(int i=2;i<=Math.sqrt(prime.length);i++) {
            if(prime[i]) continue;
            for(int j=i+i;j<prime.length;j+=i) {
                prime[j] = true;
            }
        }
    }
}

