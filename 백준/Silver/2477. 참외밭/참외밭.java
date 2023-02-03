import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[][] arr = new int[6][2];
        int[] cnt = new int[5];
        StringTokenizer st;
        //큰 사각형 - 외부 작은 사각형 넓이로 육각형 넓이 계산
        //큰 변의 길이 찾기, 한번만 이동한 방향은 큰 변
        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            cnt[arr[i][0]]++;
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        //큰 사각형 넓이
        int area = 1;
        for (int i = 1; i < cnt.length; i++) {
            if(cnt[i]==1) {
                for (int j = 0; j < arr.length; j++) {
                    if(arr[j][0]==i) {
                        area *= arr[j][1];
                        break;
                    }

                }
            }
        }
        //외부 작은 사각형 변 찾기
        int s1 = 0, s2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if((arr[i][0]^arr[(i+1)%arr.length][0]^arr[(i+2)%arr.length][0]^arr[(i+3)%arr.length][0])==0) {
                s1 = arr[(i+1)%arr.length][1]; s2 = arr[(i+2)%arr.length][1];
            }
        }
        area -= s1*s2;
        int ans = area*num;
        System.out.println(ans);
    }
}
