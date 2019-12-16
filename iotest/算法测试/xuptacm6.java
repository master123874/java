package iotest.算法测试;

import java.util.Scanner;

public class xuptacm6 {
    public static void reverse(int[] a,int a1,int b){
        int t = a[a1-1];
        a[a1-1]=a[b-1];
        a[b-1]=t;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int t1 = sc.nextInt();
        int[] a = new int[t];
        for(int i=0;i<t;i++)a[i] = sc.nextInt();
        for(int i=0;i<t1;i++){
            int b =sc.nextInt();
            int c = sc.nextInt();
            reverse(a,b,c);
        }
        for (int x:a) {
            System.out.println(x);
        }
    }
}
