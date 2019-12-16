package iotest.算法测试;

import java.util.Arrays;
import java.util.Scanner;

public class xuptacm1 {
    public static int[] reverse(int[] a){
        int[] t= new int[a.length];
        for(int i=a.length-1;i>=0;i--){
            t[a.length-i-1]=a[i];
        }
        return t;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int t = sc.nextInt();
            int[] a = new int[t];
            int[] a1=new int[t];
            for(int j1=0;j1<t;j1++){
                a[j1]=sc.nextInt();
            }
            for(int j1=0;j1<t;j1++){
                a1[j1]=sc.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(a1);
            int[] t1=reverse(a1);
            int sum=0;
            for(int j=0;j<t;j++){
                sum+=a[j]*t1[j];
            }
            System.out.println(sum);
        }
    }
}
