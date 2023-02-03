public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        boolean[] selfNum = new boolean[10001];

        for(int i=0;i<10000;i++) {
            if(d(i)<=10000) {
                selfNum[d(i)] = true;
            }
        }
        for(int i=1;i<=10000;i++) {
            if(selfNum[i]==false) sb.append(i+"\n");
        }
        System.out.println(sb);
    }


    static int d(int n) {
        int sum = n;

        while(n!=0) {
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
}
