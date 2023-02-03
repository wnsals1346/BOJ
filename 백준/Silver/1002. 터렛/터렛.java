import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int ans;
        StringBuilder sb = new StringBuilder();
        while(c-->0) {
            st = new StringTokenizer(br.readLine());
            ans = findPoint(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
            sb.append(ans).append("\n");
        }
        System.out.print(sb);

    }
    static int findPoint(int x1, int y1, int r1, int x2, int y2, int r2) {
        int l = r1+r2;
        int distance_pow = (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
        // case 1 : 중점이 같은 경우 (적과의 거리기 때문에 r은 같다)
        if(x1 == x2 && y1 == y2 && r1==r2) return -1;
        // case 2-1 : 두 원의 반지름 합보다 중점간 거리가 더 길 때
        else if(distance_pow > Math.pow(r1 + r2, 2)) return 0;
        // case 2-2 : 원 안에 원이 있으나 내접하지 않을 때
        else if(distance_pow < Math.pow(r2 - r1, 2)) return 0;
        // case 3-1 : 내접할 때
        else if(distance_pow == Math.pow(r2 - r1, 2)) return 1;
        // case 3-2 : 외접할 때
        else if(distance_pow == Math.pow(r1 + r2, 2)) return 1;
        else return 2;
    }
}
