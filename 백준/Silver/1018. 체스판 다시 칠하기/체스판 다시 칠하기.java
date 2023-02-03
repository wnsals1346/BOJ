import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String rc = br.readLine();
        int row = Integer.parseInt(rc.split(" ")[0]);
        int column = Integer.parseInt(rc.split(" ")[1]);
        int t = 64;
        String[][] board = new String[row][column];
        for (int i = 0; i < row; i++) {
            board[i] = br.readLine().split("");
        }


        int cnt = 0;
        int min = 64;
        for (int i = 0; i < row-7; i++) {
            for (int j = 0; j < column-7; j++) {
                for (int m = i; m < i+8; m++) {
                    if (m%2==0) {
                        for (int n = j; n < j+8; n++) {
                            if (n%2==0) {
                                if(!board[m][n].equals("W")) cnt++;
                            } else {
                                if(!board[m][n].equals("B")) cnt++;
                            }
                        }
                    } else {
                        for (int n = j; n < j+8; n++) {
                            if (n%2==0) {
                                if(!board[m][n].equals("B")) cnt++;
                            } else {
                                if(!board[m][n].equals("W")) cnt++;
                            }
                        }
                    }
                }
                min = Math.min(min,Math.min(cnt,t-cnt));
                cnt=0;
            }
        }
        System.out.println(min);


    }
}
