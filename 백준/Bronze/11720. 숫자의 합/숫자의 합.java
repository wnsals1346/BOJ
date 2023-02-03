import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cnt;
        Scanner in = new Scanner(System.in);
        Sum sum = new Sum(in.nextInt(),in.next());  //in.nextLine()은 띄어쓰기를 포함하여 Enter 전까지 읽음 아무것도 입력하지 않아도 Enter를 입력하면 전송된다. in.next는 띄어쓰기 전까지
        sum.sum();
    }
}

class Sum {
    private String[] arr;
    private int sum;
    private int cnt;

    Sum(int cnt, String num) {
        arr = num.split("");
        this.cnt = cnt;
        sum = 0;
    }

    public void sum() {
        for(int i=0; i<cnt;i++) {
            sum += Integer.parseInt(arr[i]);
        }
        System.out.println(sum);
    }
}