package iotest.算法测试.算法进阶;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class leedcode17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a= new String[n];
        for(int i = 0;i<n;i++){
            a[i]=sc.next();
        }
        Arrays.sort(a);
        for(int i = 0;i<n;i++){
            System.out.println(a[i]);
        }
    }

}
