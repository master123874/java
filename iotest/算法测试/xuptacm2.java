package iotest.算法测试;

import java.util.Scanner;

public class xuptacm2 {
    public static boolean judge(int n){
        if(n<=1)return false;
        for(int t=2;t<=Math.sqrt((double)n);t++){
            if(n%t==0)return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        long t=0;
        for(int i=2;i<=n;i++){
            if(judge(i))t+=i;
        }
        System.out.print(t);
    }
}
