package BaekJoonStep.s20;
//https://www.acmicpc.net/problem/10828 - 스택

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        MyStack ms = new MyStack();
        StringBuilder sb = new StringBuilder();
        while(t-->0) {
            String str = br.readLine();
            switch (str) {
                case "pop" :
                    sb.append(ms.pop()).append("\n");
                    break;
                case "size" :
                    sb.append(ms.size()).append("\n");
                    break;
                case "empty" :
                    sb.append(ms.empty()).append("\n");
                    break;
                case "top" :
                    sb.append(ms.top()).append("\n");
                    break;
                default :
                    ms.push(Integer.parseInt(str.split(" ")[1]));

            }
        }
        System.out.println(sb);
    }
}

class MyStack {
    private int val;
    private final int VOLUME = 10000;
    private int count;
    private int[] elementData = new int[VOLUME];

    public MyStack() {

    }

    public void push(int x) {
        elementData[count] = x;
        count++;
    }
    public int pop() {
        if(size()==0) return -1;
        count--;
        int x = elementData[count];
        elementData[count] = 0;
        return x;
    }
    public int size() {
        return count;
    }
    public int empty() {
        if(size()>0) return 0;
        else return 1;
    }
    public int top() {
        int x = -1;
        if(size()!=0) {
            x = elementData[count-1];
        }
        return x;
    }

}
