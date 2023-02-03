import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int min = 0;
        boolean flag = true;
        for(int i=in.nextInt(), j=in.nextInt();i<=j;i++){
            sum += sol(i);
            if(flag&&sol(i)!=0) {
                min = sol(i);
                flag = false;
            }
        }
        if(sum==0) System.out.println(-1);
        else System.out.print(sum+"\n"+min);
    }
    static int sol(int num) {
        int end = (int)Math.sqrt(num);
        if(num==1) return 0;
        else if(num==2||num==3) return num;
        for(int i=2;i<=end;i++) {
            if(num%i==0) {
                return 0;
            }
        }
        return num;
    }
}
