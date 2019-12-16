package iotest.算法测试;

import java.util.ArrayList;

@SuppressWarnings("all")
public class leedcode169 {
    public static String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while(n>0){
            int t = n%26;
            if(t==0){
                sb.append('Z');
                n-=26;
                n/=26;
                continue;
            }
            else sb.append((char)(64+t));
            n/=26;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(convertToTitle(52));
        ArrayList<Integer> list = new ArrayList<>();

    }
}
